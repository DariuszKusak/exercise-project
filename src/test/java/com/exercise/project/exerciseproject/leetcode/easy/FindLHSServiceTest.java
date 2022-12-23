package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindLHSServiceTest {

    @Autowired
    private FindLHSService service;

    @Test
    void findLHS() {
        int[] array = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        assertEquals(5, service.findLHS(array));
    }
}