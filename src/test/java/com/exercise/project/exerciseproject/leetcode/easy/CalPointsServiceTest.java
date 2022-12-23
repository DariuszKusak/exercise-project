package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalPointsServiceTest {

    @Autowired
    private CalPointsService service;

    @Test
    void calPoints() {
        service.calPoints(new String[]{"5","2","C","D","+"});
    }
}