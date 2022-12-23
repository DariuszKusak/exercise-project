package com.exercise.project.exerciseproject.array.multi.dimentional;

import com.exercise.project.exerciseproject.ztm.array.multi.dimentional.BFSService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BFSServiceTest {

    @Autowired
    BFSService service;

    @Test
    void bfs() {
        int[][] matrix = new int[][]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8, 9, 10},
                new int[]{11, 12, 13, 14, 15},
                new int[]{16, 17, 18, 19, 20}
        };
        assertArrayEquals(new int[]{}, service.bfs(matrix));
    }
}