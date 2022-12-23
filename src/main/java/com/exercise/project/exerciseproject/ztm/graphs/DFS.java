package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DFS {
    public int[] dfs(int[][] data) {
        return dfs(data, data[0], new HashSet<>(), new ArrayList<>()).stream().mapToInt(in -> in).toArray();
    }

    private List<Integer> dfs(int[][] data, int[] connectionsIndexes, Set<Integer> seen, List<Integer> result) {
        for (int index : connectionsIndexes) {
            if (!seen.contains(index)) {
                result.add(index);
                seen.add(index);
                dfs(data, data[index], seen, result);
            }
        }

        return result;
    }

}
