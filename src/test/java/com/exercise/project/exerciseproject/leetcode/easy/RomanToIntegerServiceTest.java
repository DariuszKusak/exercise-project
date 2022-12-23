package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.RomanToIntegerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomanToIntegerServiceTest {

    @Autowired
    RomanToIntegerService service;

    @Test
    void romanToInt() {
        System.out.println(service.romanToInt("MCMXCIV"));
    }
}