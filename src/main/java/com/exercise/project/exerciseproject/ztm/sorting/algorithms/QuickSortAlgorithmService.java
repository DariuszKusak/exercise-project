package com.exercise.project.exerciseproject.ztm.sorting.algorithms;

import org.springframework.stereotype.Service;

@Service
public class QuickSortAlgorithmService implements AlgorithmSort {

    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            sort(array, left, partitionIndex - 1);
            sort(array, partitionIndex + 1, right);
        }
        return array;
    }

    int partition(int[] array, int left, int right) {
        int pivotElement = array[right];
        int position = left;

        for (int i = left; i < right; i++) {
            if (array[i] < pivotElement) {
                int tmp = array[i];
                array[i] = array[position];
                array[position] = tmp;
                position++;
            }
        }

        int tmp = array[position];
        array[position] = array[right];
        array[right] = tmp;


        return position;
    }

}
