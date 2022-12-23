package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindPivotServiceTest {

    @Autowired
    FindPivotService service;

    @ParameterizedTest
    @MethodSource("provider")
    void pivotIndex(int result, int[] arr) {
        assertEquals(result, service.pivotIndex(arr));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(3, new int[]{1, 7, 3, 6, 5, 6}),
                Arguments.of(0, new int[]{2, 1, -1})
        );
    }

}