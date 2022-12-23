package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContainsNearbyDuplicateService {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Set<Integer>> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                int finalI = i;
                if (cache.get(nums[i]).stream().anyMatch(idx -> Math.abs(finalI - idx) <= k)) {
                    return true;
                } else {
                    Set<Integer> integers = cache.get(nums[i]);
                    integers.add(i);
                    cache.put(nums[i], integers);
                }
            } else {
                cache.put(nums[i], new HashSet<>(List.of(i)));
            }
        }
        return false;
    }
}
