package com.exercise.project.exerciseproject.dynamic.programming;

import com.exercise.project.exerciseproject.ztm.dynamic.programming.KnightProbabilityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KnightProbabilityServiceTest {

    @Autowired
    KnightProbabilityService service;

    @Test
    void knightProbability() {
        int n = 3;
        int k = 2;
        int row = 0;
        int column = 0;

        service.knightProbability(n, k, row, column);

    }


}