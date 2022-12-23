package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaxCountServiceTest {

    @Autowired
    MaxCountService service;

    @Test
    void maxCount() {
        assertEquals(4, service.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }
}