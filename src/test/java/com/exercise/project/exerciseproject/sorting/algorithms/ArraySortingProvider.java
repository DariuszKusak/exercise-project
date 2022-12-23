package com.exercise.project.exerciseproject.sorting.algorithms;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ArraySortingProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{0, -1, 2}, new int[]{-1, 0, 2}),
                Arguments.of(new int[]{7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7}),
                Arguments.of(new int[]{12, 0, -2, 34, -100, 5, -2, 4, 2, 7}, new int[]{-100, -2, -2, 0, 2, 4, 5, 7, 12, 34}));
    }
}
