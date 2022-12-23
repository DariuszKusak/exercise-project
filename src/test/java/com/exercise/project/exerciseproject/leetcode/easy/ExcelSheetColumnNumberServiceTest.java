package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.ExcelSheetColumnNumberService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExcelSheetColumnNumberServiceTest {

    @Autowired
    ExcelSheetColumnNumberService service;

    @ParameterizedTest
    @MethodSource("ExcelSheetColumnNumberServiceTestProvider")
    void titleToNumber(String columnTitle, int result) {
        assertEquals(result, service.titleToNumber(columnTitle));
    }

    private static Stream<Arguments> ExcelSheetColumnNumberServiceTestProvider() {
        return Stream.of(
                Arguments.of("A", 1),
                Arguments.of("AB", 28),
                Arguments.of("ZY", 701)
        );
    }
}