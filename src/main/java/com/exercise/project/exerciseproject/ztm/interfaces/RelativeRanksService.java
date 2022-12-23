package com.exercise.project.exerciseproject.ztm.interfaces;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RelativeRanksService {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        heap.addAll(Arrays.stream(score).boxed().collect(Collectors.toSet()));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        String[] result = new String[score.length];

        while (!heap.isEmpty()) {
            int value = result.length - heap.size() + 1;
            result[map.get(heap.poll())] = value == 1 ? "Gold Medal" : value == 2 ? "Silver Medal" : value == 3 ? "Bronze Medal" : String.valueOf(value);
        }

        return result;
    }
}
