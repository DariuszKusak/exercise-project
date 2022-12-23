package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.CanFinishService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CanFinishServiceTest {

    @Autowired
    CanFinishService service;

    @Test
    void canFinish() {
        int[][] prerequisites = new int[][]{
                {1, 0},
                {2, 1},
                {2, 5},
                {0, 3},
                {4, 3},
                {3, 5},
                {4, 5}
        };

//        int[][] prerequisites = new int[][]{
//                {2,0},
//                {1,0},
//                {3,1},
//                {3,2},
//                {1,3}
//        };


        assertTrue(service.canFinish(6, prerequisites));

    }
}