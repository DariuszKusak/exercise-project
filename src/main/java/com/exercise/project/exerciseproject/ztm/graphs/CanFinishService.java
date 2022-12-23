package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CanFinishService {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length <= 1) {
            return true;
        }

        Map<Integer, Set<Integer>> storage = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            int[] vertex = prerequisites[i];

            if (!storage.containsKey(vertex[1])) {
                storage.put(vertex[1], new HashSet<>());
            }
            if (!storage.containsKey(vertex[0])) {
                storage.put(vertex[0], new HashSet<>(Set.of(vertex[1])));
            } else {
                storage.get(vertex[0]).add(vertex[1]);
            }
        }
        return reduceNotBlockedVertexes(storage).isEmpty();
    }

    private Map<Integer, Set<Integer>> reduceNotBlockedVertexes(Map<Integer, Set<Integer>> storage) {
        if (!storage.containsValue(Collections.emptySet())) {
            return storage;
        } else {
            Set<Integer> notBlockedVertexes = storage.entrySet().stream().filter(vertex -> vertex.getValue().isEmpty()).map(Map.Entry::getKey).collect(Collectors.toSet());

            for (Integer notBlockedVertex : notBlockedVertexes) {
                storage.remove(notBlockedVertex);
                storage.forEach((key, value) -> value.remove(notBlockedVertex));
            }

            return reduceNotBlockedVertexes(storage);
        }
    }

}
