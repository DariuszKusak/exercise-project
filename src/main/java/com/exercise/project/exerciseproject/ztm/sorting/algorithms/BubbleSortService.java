package com.exercise.project.exerciseproject.ztm.sorting.algorithms;

import org.springframework.stereotype.Service;

@Service
public class BubbleSortService implements AlgorithmSort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
