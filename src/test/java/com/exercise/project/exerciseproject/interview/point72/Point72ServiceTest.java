package com.exercise.project.exerciseproject.interview.point72;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Point72ServiceTest {
    @Autowired
    Point72Service service;

    @ParameterizedTest
    @MethodSource("intersectionProvider")
    void intersection(List<Integer> result, List<Integer> list1, List<Integer> list2) {
        assertEquals(result, service.intersection(list1, list2));
    }

    //result | list1 | list2
    private static Stream<Arguments> intersectionProvider() {
        return Stream.of(
                Arguments.of(List.of(2, 3), List.of(1, 2, 3, 4, 5), List.of(2, 3, 7, 8)),
                Arguments.of(List.of(1, 2), List.of(1, 1, 1, 2, 3), List.of(1, 2, 7, 8)),
                Arguments.of(Collections.emptyList(), Collections.emptyList(), List.of(1, 2, 7, 8)),
                Arguments.of(Collections.emptyList(), List.of(1, 1, 1, 2, 3), Collections.emptyList()),
                Arguments.of(Collections.emptyList(), null, List.of(1, 2, 7, 8)),
                Arguments.of(Collections.emptyList(), List.of(1, 1, 1, 2, 3), null)
        );
    }

}