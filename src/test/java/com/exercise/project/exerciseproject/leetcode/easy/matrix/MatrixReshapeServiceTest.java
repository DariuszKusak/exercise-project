package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MatrixReshapeServiceTest {

    @Autowired
    MatrixReshapeService service;

    @Test
    void matrixReshape() {
        service.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
    }
}