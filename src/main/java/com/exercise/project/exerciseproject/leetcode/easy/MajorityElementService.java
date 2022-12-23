package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@Service
public class MajorityElementService {
    Map<Integer, Integer> storage = new HashMap<>();

    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (storage.containsKey(element)) {
                storage.put(element, storage.get(element) + 1);
            } else {
                storage.put(element, 1);
            }
        }

        return storage.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);

    }

}
