package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThirdMaximumNumberServiceTest {

    @Autowired
    ThirdMaximumNumberService service;

    @Test
    void thirdMax() {
        int[] nums = new int[]{2, 2, 3, 1};

        service.thirdMax(nums);
    }
}