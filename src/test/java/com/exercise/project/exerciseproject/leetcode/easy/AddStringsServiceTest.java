package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.string.AddStringsService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddStringsServiceTest {

    @Autowired
    AddStringsService service;

    @ParameterizedTest
    @MethodSource("addStringsProvider")
    void addStrings(String num1, String num2, String sum) {
        assertEquals(sum, service.addStrings(num1, num2));
    }

    private static Stream<Arguments> addStringsProvider() {
        return Stream.of(
//                Arguments.of("11", "123", "134")
//                Arguments.of("456", "77", "533")
//                Arguments.of("1", "9", "10")
                Arguments.of("9", "99", "108")
        );
    }

}