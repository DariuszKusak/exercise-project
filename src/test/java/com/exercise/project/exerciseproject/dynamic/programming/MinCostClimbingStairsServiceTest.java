package com.exercise.project.exerciseproject.dynamic.programming;

import com.exercise.project.exerciseproject.ztm.dynamic.programming.MinCostClimbingStairsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MinCostClimbingStairsServiceTest {

    @Autowired
    MinCostClimbingStairsService service;

    @Test
    void minCostClimbingStairs() {

        assertEquals(1, service.minCostClimbingStairs(new int[]{0,1,1,1}));
    }
}