package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.UglyNumberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UglyNumberServiceTest {

    @Autowired
    UglyNumberService service;

    @Test
    void isUgly() {

        service.isUgly(14);

    }
}