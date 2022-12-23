package com.exercise.project.exerciseproject;

import com.exercise.project.exerciseproject.ztm.array.multi.dimentional.OrangeRottingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrangeRottingServiceTest {

    @Autowired
    OrangeRottingService orangeRottingService;

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
        orangeRottingService.orangesRotting(ints);
    }
}