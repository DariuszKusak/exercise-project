package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FindMaxAverageServiceTest {

    @Autowired
    FindMaxAverageService service;

    @Test
    void findMaxAverage() {
        service.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
    }
}