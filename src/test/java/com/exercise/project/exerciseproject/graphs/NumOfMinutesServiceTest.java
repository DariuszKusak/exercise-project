package com.exercise.project.exerciseproject.graphs;

import com.exercise.project.exerciseproject.ztm.graphs.NumOfMinutesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NumOfMinutesServiceTest {

    @Autowired
    NumOfMinutesService service;

    @Test
    void numOfMinutes() {
        assertEquals(612, service.numOfMinutes(8, 0, new int[]{-1,5,0,6,7,0,0,0}, new int[]{89,0,0,0,0,523,241,519}));
//        assertEquals(1, service.numOfMinutes(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0, 0}));
//        assertEquals(1076, service.numOfMinutes(4, 2, new int[]{3,3,-1,2}, new int[]{0,0,162,914}));
    }

}