package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TopologicalSortService {

    public int[] sort(int[][] data) {
        Map<Integer, Set<Integer>> storage = new HashMap<>();

        for (int[] vertex : data) {
            if (!storage.containsKey(vertex[1])) {
                storage.put(vertex[1], new HashSet<>());
            }
            if (!storage.containsKey(vertex[0])) {
                storage.put(vertex[0], new HashSet<>(Set.of(vertex[1])));
            } else {
                storage.get(vertex[0]).add(vertex[1]);
            }
        }

        return reduce(storage).keySet().stream().mapToInt(integer -> integer).toArray();
    }


    private Map<Integer, Set<Integer>> reduce(Map<Integer, Set<Integer>> storage) {
        if (!storage.containsValue(Collections.emptySet())) {
            return storage;
        } else {
            Set<Map.Entry<Integer, Set<Integer>>> empties = storage.entrySet().stream().filter(entry -> entry.getValue().isEmpty()).collect(Collectors.toSet());
            for (Map.Entry<Integer, Set<Integer>> empty : empties) {
                storage.remove(empty.getKey());
                storage.forEach((key, value) -> value.remove(key));
            }
            return reduce(storage);
        }

    }


}
