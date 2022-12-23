package com.exercise.project.exerciseproject.array;

import lombok.experimental.UtilityClass;

import java.util.stream.IntStream;

@UtilityClass
public class ArrayUtils {

    public int[] provide(int startInclusive, int endInclusive) {
        return IntStream.rangeClosed(startInclusive, endInclusive).toArray();
    }
}
