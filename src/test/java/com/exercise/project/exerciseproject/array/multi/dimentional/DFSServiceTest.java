package com.exercise.project.exerciseproject.array.multi.dimentional;

import com.exercise.project.exerciseproject.ztm.array.multi.dimentional.DFSService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class DFSServiceTest {

    @Autowired
    DFSService service;

    @Test
    void dfs() {
        int[][] matrix = new int[][]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8, 9, 10},
                new int[]{11, 12, 13, 14, 15},
                new int[]{16, 17, 18, 19, 20}
        };
        System.out.println(Arrays.toString(service.dfs(matrix)));

        assertArrayEquals(new int[]{}, service.dfs(matrix));
    }
}