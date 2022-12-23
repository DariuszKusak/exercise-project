package com.exercise.project.exerciseproject.ztm.sorting.algorithms;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MergeSortService implements AlgorithmSort {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        return merge(sort(Arrays.copyOfRange(array, 0, array.length / 2)), sort(Arrays.copyOfRange(array, array.length / 2, array.length)));
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < result.length; i++) {
            if (leftIndex == left.length) {
                result[i] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex == right.length) {
                result[i] = left[leftIndex];
                leftIndex++;
            } else if (left[leftIndex] <= right[rightIndex]) {
                result[i] = left[leftIndex];
                leftIndex++;
            } else {
                result[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return result;
    }


    public int[] mergeSortVer2(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        LinkedList<LinkedList<Integer>> storage = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            storage.add(new LinkedList<>(List.of(array[i])));
        }
        return mergeSort(storage.pollFirst(), storage.pollFirst(), storage);
    }

    private int[] mergeSort(LinkedList<Integer> left, LinkedList<Integer> right, LinkedList<LinkedList<Integer>> storage) {
        if (storage.size() == 1) {
            LinkedList<Integer> merge = merge(left, right);
            LinkedList<Integer> merge1 = merge(merge, storage.pollFirst());
            return merge1.stream().mapToInt(i -> i).toArray();
        } else {
            storage.addLast(merge(left, right));
            mergeSort(storage.pollFirst(), storage.pollFirst(), storage);
        }

        return storage.getFirst().stream().mapToInt(i -> i).toArray();
    }

    private LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        return Stream.concat(left.stream(), right.stream()).sorted().collect(Collectors.toCollection(LinkedList::new));
    }
}
