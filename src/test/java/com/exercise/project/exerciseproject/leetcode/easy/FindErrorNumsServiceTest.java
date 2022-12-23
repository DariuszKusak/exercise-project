package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindErrorNumsServiceTest {

    @Autowired
    FindErrorNumsService service;

    @Test
    void findErrorNums() {
        service.findErrorNums(new int[]{1,2,2,4});
    }
}