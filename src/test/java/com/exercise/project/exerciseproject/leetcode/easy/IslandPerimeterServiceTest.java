package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IslandPerimeterServiceTest {

    @Autowired
    IslandPerimeterService service;

    @Test
    void islandPerimeter() {
        assertEquals(4, service.islandPerimeter(new int[][]{new int[]{0, 1}}));


//        assertEquals(16, service.islandPerimeter(new int[][]{
//                new int[]{0,1,0,0},
//                new int[]{1,1,1,0},
//                new int[]{0,1,0,0},
//                new int[]{1,1,0,0}
//        }));
    }
}