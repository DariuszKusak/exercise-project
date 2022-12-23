package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.AddBinaryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddBinaryServiceTest {

    @Autowired
    AddBinaryService service;

    @Test
    void addBinary() {

        service.addBinary("11", "1");
    }
}