package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FindMaxConsecutiveOnesServiceTest {

    @Autowired
    FindMaxConsecutiveOnesService service;

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1,0,1,1,0,1};

        service.findMaxConsecutiveOnes(nums);
    }
}