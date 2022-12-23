package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.TopologicalSortService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class TopologicalSortServiceTest {

    @Autowired
    TopologicalSortService service;

    @Test
    void sort() {
        int[][] pairs = new int[][]{
                new int[]{3, 2},
                new int[]{0, 5},
                new int[]{0, 4},
                new int[]{1, 4},
                new int[]{3, 0}
        };
//
//        int[][] pairs = new int[][]{
//                new int[]{0, 5},
//                new int[]{0, 1},
//                new int[]{4, 0},
//                new int[]{1, 4}
//        };

        int nodes = 3;

        System.out.println(Arrays.toString(service.sort(pairs)));

        assertArrayEquals(new int[]{}, service.sort(pairs));
    }
}