package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FindLHSService {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counting = new HashMap<>();
        int lhs = 0;

        for (int i = 0; i < nums.length; i++) {
            if (counting.containsKey(nums[i])) {
                counting.put(nums[i], counting.get(nums[i]) + 1);
            } else {
                counting.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counting.entrySet()) {
            if (counting.containsKey(entry.getKey() + 1)) {
                lhs = Math.max(lhs, entry.getValue() + counting.get(entry.getKey() + 1));
            }
        }

        return lhs;
    }
}
