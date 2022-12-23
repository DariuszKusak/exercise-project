package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReverseStrServiceTest {

    @Autowired
    ReverseStrService service;

    @Test
    void reverseStr() {

        System.out.println(service.reverseStr("abcdefg", 2));
    }
}