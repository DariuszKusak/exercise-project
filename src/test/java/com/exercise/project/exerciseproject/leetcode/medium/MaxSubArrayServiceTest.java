package com.exercise.project.exerciseproject.leetcode.medium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaxSubArrayServiceTest {

    @Autowired
    MaxSubArrayService service;

    @Test
    void maxSubArray() {
        assertEquals(6, service.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, - 5, 4}));
    }
}