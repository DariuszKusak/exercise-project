package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.NetworkDelayTimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NetworkDelayTimeServiceTest {

    @Autowired
    NetworkDelayTimeService service;

    @Test
    void networkDelayTime() {
        int[][] times = new int[][]{
                new int[]{1, 2, 9},
                new int[]{1, 4, 2},
                new int[]{2, 5, 1},
                new int[]{4, 2, 4},
                new int[]{4, 5, 6},
                new int[]{3, 2, 3},
                new int[]{5, 3, 7},
                new int[]{3, 1, 5}
        };
        int n = 5;
        int k = 1;

        assertEquals(14, service.networkDelayTime(times, n, k));
    }
}