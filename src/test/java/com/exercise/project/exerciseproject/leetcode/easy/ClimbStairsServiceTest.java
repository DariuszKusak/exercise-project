package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.ClimbStairsService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClimbStairsServiceTest {

    @Autowired
    ClimbStairsService service;

    @ParameterizedTest
    @MethodSource("climbStairsServiceTestProvider")
    void climbStairs(int n, int result) {
        assertEquals(result, service.climbStairs(n));
    }

    private static Stream<Arguments> climbStairsServiceTestProvider() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(5, 8)
        );
    }
}