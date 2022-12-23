package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.FirstBadVersionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstBadVersionServiceTest {

    @Autowired
    FirstBadVersionService service;

    @Test
    void firstBadVersion() {
        service.firstBadVersion(5);
    }
}