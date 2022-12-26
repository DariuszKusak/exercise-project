package com.exercise.project.exerciseproject.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArrayExercisesServiceTest {

    @Autowired
    private ArrayExercisesService arrayExercisesService;

    @Test
    void twoIndicesSumToNumberBruteForce() {
        assertNull(arrayExercisesService.twoSumBrute(null, 0));
        assertNull(arrayExercisesService.twoSumBrute(new int[]{1}, 0));
        assertNull(arrayExercisesService.twoSumBrute(new int[]{1, 2}, 4));
        assertNull(arrayExercisesService.twoSumBrute(new int[]{1, 2, 3}, 14));
        assertArrayEquals(new int[]{3, 4}, arrayExercisesService.twoSumBrute(new int[]{1, 3, 7, 9, 2}, 11));
    }

    @Test
    void twoIndicesSumToNumber() {
        assertNull(arrayExercisesService.twoSum(null, 0));
        assertNull(arrayExercisesService.twoSum(new int[]{1}, 0));
        assertNull(arrayExercisesService.twoSum(new int[]{1, 2}, 4));
        assertNull(arrayExercisesService.twoSum(new int[]{1, 2, 3}, 14));
        assertArrayEquals(new int[]{3, 4}, arrayExercisesService.twoSum(new int[]{1, 3, 7, 9, 2}, 11));
    }

    @Test
    void maxAreaBruteForce() {
        assertEquals(0, arrayExercisesService.maxAreaBruteForce(null));
        assertEquals(0, arrayExercisesService.maxAreaBruteForce(new int[]{}));
        assertEquals(2, arrayExercisesService.maxAreaBruteForce(new int[]{2, 2}));
        assertEquals(2, arrayExercisesService.maxAreaBruteForce(new int[]{2, 4}));
        assertEquals(2, arrayExercisesService.maxAreaBruteForce(new int[]{4, 2}));
        assertEquals(49, arrayExercisesService.maxAreaBruteForce(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void maxArea() {
        assertEquals(0, arrayExercisesService.maxArea(null));
        assertEquals(0, arrayExercisesService.maxArea(new int[]{}));
        assertEquals(2, arrayExercisesService.maxArea(new int[]{2, 2}));
        assertEquals(2, arrayExercisesService.maxArea(new int[]{2, 4}));
        assertEquals(2, arrayExercisesService.maxArea(new int[]{4, 2}));
        assertEquals(49, arrayExercisesService.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void trap() {
        assertEquals(0, arrayExercisesService.trap(null));
        assertEquals(0, arrayExercisesService.trap(new int[]{}));
        assertEquals(0, arrayExercisesService.trap(new int[]{2}));
        assertEquals(0, arrayExercisesService.trap(new int[]{2, 4}));
//        assertEquals(1, arrayExercisesService.trap(new int[]{1, 0, 1}));
        assertEquals(6, arrayExercisesService.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}