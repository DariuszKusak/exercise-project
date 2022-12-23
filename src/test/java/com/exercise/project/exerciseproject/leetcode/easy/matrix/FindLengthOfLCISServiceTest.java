package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindLengthOfLCISServiceTest {

    @Autowired
    FindLengthOfLCISService service;

    @Test
    void findLengthOfLCIS() {
        assertEquals(3, service.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }
}