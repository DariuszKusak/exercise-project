package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindAllNumbersDisappearedInArrayServiceTest {
    @Autowired
    FindAllNumbersDisappearedInArrayService service;

    @ParameterizedTest
    @MethodSource("findDisappearedNumbersProvider")
    void findDisappearedNumbers(List<Integer> missing, int[] nums) {
        assertEquals(missing, service.findDisappearedNumbers(nums));
    }

    private static Stream<Arguments> findDisappearedNumbersProvider() {
        return Stream.of(
                Arguments.of(List.of(5, 6), new int[]{4, 3, 2, 7, 8, 2, 3, 1})
        );
    }

}