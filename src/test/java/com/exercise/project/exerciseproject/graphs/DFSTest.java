package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.DFS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class DFSTest {

    @Autowired
    DFS service;

    @Test
    void dfs() {
        int[][] adjacencyList = new int[][]{
                new int[]{1, 3},
                new int[]{0},
                new int[]{3, 8},
                new int[]{0, 2, 4, 5},
                new int[]{3, 6},
                new int[]{3},
                new int[]{4, 7},
                new int[]{6},
                new int[]{2}
        };

        System.out.println(Arrays.toString(service.dfs(adjacencyList)));

    }
}
