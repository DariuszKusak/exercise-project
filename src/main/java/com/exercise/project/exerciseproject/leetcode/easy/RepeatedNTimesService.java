package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RepeatedNTimesService {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> storage = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int value = nums[i];

            if (storage.containsKey(value)) {
                storage.put(value, storage.get(value) + 1);
            } else {
                storage.put(value, 1);
            }

        }


        return storage.entrySet().stream().filter(e -> e.getValue() == nums.length/2).findFirst().map(Map.Entry::getKey).orElse(-1);
    }
}
