package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IsToeplitzMatrixServiceTest {

    @Autowired
    IsToeplitzMatrixService service;

    @MethodSource("provider")
    @ParameterizedTest
    void isToeplitzMatrix(boolean result, int[][] array) {
        assertEquals(result, service.isToeplitzMatrix(array));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(true, new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}),
                Arguments.of(false, new int[][]{{36, 59, 71, 15, 26, 82, 87}, {56, 36, 59, 71, 15, 26, 82}, {15, 0, 36, 59, 71, 15, 26}})
        );
    }

}