package com.exercise.project.exerciseproject.interfaces;

import com.exercise.project.exerciseproject.ztm.interfaces.RelativeRanksService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelativeRanksServiceTest {

    @Autowired
    RelativeRanksService service;

    @Test
    void findRelativeRanks() {

        int[] score = new int[]{10,3,8,9,4};

        service.findRelativeRanks(score);

    }
}