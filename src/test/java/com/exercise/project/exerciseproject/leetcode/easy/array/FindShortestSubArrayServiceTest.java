package com.exercise.project.exerciseproject.leetcode.easy.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindShortestSubArrayServiceTest {

    @Autowired
    FindShortestSubArrayService service;

    @ParameterizedTest
    @MethodSource("provider")
    void findShortestSubArray(int result, int[] arguments) {
        assertEquals(result, service.findShortestSubArray(arguments));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(2, new int[]{1, 2, 2, 3, 1}),
                Arguments.of(2, new int[]{1, 1})
        );
    }

}