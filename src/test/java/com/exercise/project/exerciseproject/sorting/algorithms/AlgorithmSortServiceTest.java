package com.exercise.project.exerciseproject.sorting.algorithms;

import com.exercise.project.exerciseproject.ztm.sorting.algorithms.AlgorithmSort;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class AlgorithmSortServiceTest {

    @Autowired
    List<AlgorithmSort> services;

    @ParameterizedTest
    @ArgumentsSource(ArraySortingProvider.class)
    void sort(int[] result, int[] nums) {
        services.forEach(service -> assertArrayEquals(result, service.sort(nums)));
    }
}
