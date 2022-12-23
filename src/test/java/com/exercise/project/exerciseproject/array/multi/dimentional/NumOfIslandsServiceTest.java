package com.exercise.project.exerciseproject.array.multi.dimentional;

import com.exercise.project.exerciseproject.ztm.array.multi.dimentional.NumOfIslandsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NumOfIslandsServiceTest {

    @Autowired
    NumOfIslandsService service;

    @Test
    void numIslands() {
        char[][] landscape = new char[][]{
                new char[]{'0', '1', '0', '1', '0'},
                new char[]{'1', '0', '1', '0', '1'},
                new char[]{'0', '1', '1', '1', '0'},
                new char[]{'1', '0', '1', '0', '1'}
        };

        assertEquals(7, service.numIslands(landscape));
    }
}