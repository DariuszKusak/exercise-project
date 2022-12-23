package com.exercise.project.exerciseproject.ztm.sorting.algorithms;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InsertionSortService implements AlgorithmSort {
    @Override
    public int[] sort(int[] array) {
        List<Integer> storage = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (storage.isEmpty()) {
                storage.add(array[i]);
            } else if (array[i] > storage.get(storage.size() - 1)) {
                storage.add(array[i]);
            } else if (array[i] < storage.get(0)) {
                storage.add(0, array[i]);
            } else {
                for (int j = 0; j < storage.size(); j++) {
                    if (array[i] < storage.get(j)) {
                        storage.add(j, array[i]);
                        break;
                    }
                }
            }
        }
        return storage.stream().mapToInt(i -> i).toArray();
    }
}
