package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.BellmanFordAlgorithmService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BellmanFordAlgorithmServiceTest {

    @Autowired
    BellmanFordAlgorithmService service;

    @Test
    void bellmanFordAlgorithm() {
//        int[][] times = new int[][]{
//                new int[]{1, 2, 9},
//                new int[]{3, 2, 3},
//                new int[]{5, 3, 7},
//                new int[]{3, 1, 5},
//                new int[]{2, 5, -3},
//                new int[]{4, 5, 6},
//                new int[]{1, 4, 2},
//                new int[]{4, 2, -4}
//        };
//        int n = 5;
//        int k = 1;


        int[][] times = new int[][]{
                new int[]{2, 1, 1},
                new int[]{2, 3, 1},
                new int[]{3, 4, 1}
        };
        int n = 4;
        int k = 2;

        assertEquals(2, service.bellmanFordAlgorithm(times, n, k));
    }
}