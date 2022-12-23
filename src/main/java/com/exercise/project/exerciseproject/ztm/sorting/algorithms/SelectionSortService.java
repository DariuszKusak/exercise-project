package com.exercise.project.exerciseproject.ztm.sorting.algorithms;

import org.springframework.stereotype.Service;

@Service
public class SelectionSortService implements AlgorithmSort {

    @Override
    public int[] sort(int[] array) {
        int min;

        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (array[min] < array[i]) {
                int tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
        }
        return array;
    }
}
