package com.exercise.project.exerciseproject.array;

import com.exercise.project.exerciseproject.ztm.array.single.dimentional.TrappingRainWaterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TrappingRainWaterServiceTest {

    @Autowired
    TrappingRainWaterService service;

    @Test
    void trap() {

        String s = "abcd";
        String t = "axbyc";

        String regex = String.join("[a-z]+", s.split(""));


        System.out.println(t.matches(regex));


//        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int expected = 6;
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        int expected = 8;
//        int[] height = new int[]{4, 2, 0, 3, 2, 5};
//        int expected = 5;
//        int[] height = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//        int expected = 0;

        assertEquals(expected, service.trap(height));
    }
}