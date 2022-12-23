package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cache = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (cache.contains(nums[i])) {
                return true;
            } else {
                cache.add(nums[i]);
            }
        }
        return false;
    }

}
