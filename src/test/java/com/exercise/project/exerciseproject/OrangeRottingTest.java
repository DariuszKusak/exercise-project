package com.exercise.project.exerciseproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrangeRottingTest {

    @Autowired
    OrangeRotting orangeRotting;

    @Test
    void orangesRotting() {
        //        [[2,1,1],[0,1,1],[1,0,1]]

//        int[][] ints = {
//                new int[]{2, 1, 1},
//                new int[]{1, 1, 0},
//                new int[]{0, 1, 1}
//        };

        int[][] ints = {
                new int[]{2,1,1},
                new int[]{0,1,1},
                new int[]{1,0,1}
        };
        orangeRotting.orangesRotting(ints);
    }
}