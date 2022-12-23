package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BFS {

    public int[] bfsSearch(int[][] adjacencyList) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(adjacencyList[0]);
        List<Integer> storage = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        storage.add(0);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int c : current) {
                if (!seen.contains(c)) {
                    queue.add(adjacencyList[c]);
                    seen.add(c);
                    storage.add(c);
                }
            }

        }

        return storage.stream().mapToInt(integer -> integer).toArray();
    }


}
