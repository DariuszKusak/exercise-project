package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class BellmanFordAlgorithmService {

    public int bellmanFordAlgorithm(int[][] times, int n, int k) {
        Map<Integer, Integer> results = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toMap(Function.identity(), i -> Integer.MAX_VALUE));
        results.put(k, 0);

        for (int iteration = 0; iteration < n - 1; iteration++) {
            int count = 0;
            for (int i = 0; i < times.length; i++) {
                int[] edge = times[i];
                if (results.get(edge[0]) != Integer.MAX_VALUE && results.get(edge[0]) + times[i][2] < results.get(edge[1])) {
                    results.put(edge[1], results.get(edge[0]) + times[i][2]);
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }

        Integer max = results.values().stream().max(Integer::compareTo).orElse(-1);
        return max == Integer.MAX_VALUE ? -1 : max;
    }


}
