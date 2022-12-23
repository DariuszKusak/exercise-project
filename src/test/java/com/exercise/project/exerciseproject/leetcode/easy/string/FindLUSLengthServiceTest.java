package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindLUSLengthServiceTest {

    @Autowired
    private FindLUSLengthService service;

    @Test
    void findLUSlength() {
        System.out.println(service.findLUSlength("aba", "cdc"));
    }
}