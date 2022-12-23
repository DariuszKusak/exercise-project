package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AssignCookiesTest {

    @Autowired
    AssignCookies service;

    @Test
    void findContentChildren() {
        assertEquals(1, service.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(2, service.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
        assertEquals(2, service.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}