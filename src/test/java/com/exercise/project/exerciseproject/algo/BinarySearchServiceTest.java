package com.exercise.project.exerciseproject.algo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BinarySearchServiceTest {

    @Autowired
    BinarySearchService service;

    @ParameterizedTest
    @MethodSource("provideSortedIntArrays")
    void binarySearch(int index, int target, int[] nums) {
        assertEquals(index, service.incremental(nums, target));
        assertEquals(index, service.recursive(nums, target));
    }

    private static Stream<Arguments> provideSortedIntArrays() {
        return Stream.of(
                Arguments.of(2, 3, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3),
                Arguments.of(4, 9, new int[]{-1, 0, 3, 5, 9, 12}, 9)
        );
    }

}