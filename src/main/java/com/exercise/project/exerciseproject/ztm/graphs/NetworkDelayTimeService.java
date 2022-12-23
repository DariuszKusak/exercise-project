package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class NetworkDelayTimeService {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Integer> paths = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toMap(Function.identity(), i -> Integer.MAX_VALUE));
        Map<Integer, Set<Map.Entry<Integer, Integer>>> adjacencyList = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (int[] time : times) {
            if (adjacencyList.containsKey(time[0])) {
                adjacencyList.get(time[0]).add(Map.entry(time[1], time[2]));
            } else {
                Set<Map.Entry<Integer, Integer>> nodes = new HashSet<>();
                nodes.add(Map.entry(time[1], time[2]));
                adjacencyList.put(time[0], nodes);
            }
        }

        networkTimeService(paths, k, queue, adjacencyList);

        Integer max = paths.values().stream().max(Integer::compareTo).orElse(-1);
        return max == Integer.MAX_VALUE ? -1 : max;
    }

    private void networkTimeService(Map<Integer, Integer> paths, int k, PriorityQueue<Map.Entry<Integer, Integer>> minHeap, Map<Integer, Set<Map.Entry<Integer, Integer>>> adjacencyList) {
        if (paths.get(k) == Integer.MAX_VALUE) {
            paths.put(k, 0);
        }

        Set<Map.Entry<Integer, Integer>> entries = adjacencyList.getOrDefault(k, Collections.emptySet());
        entries.forEach(entry -> {
            Integer target = entry.getKey();

            if (paths.get(k) + entry.getValue() < paths.get(target)) {
                paths.put(target, paths.get(k) + entry.getValue());
                minHeap.add(Map.entry(target, paths.get(k) + entry.getValue()));
            }
        });

        if (!minHeap.isEmpty()) {
            networkTimeService(paths, minHeap.poll().getKey(), minHeap, adjacencyList);
        }
    }


}
