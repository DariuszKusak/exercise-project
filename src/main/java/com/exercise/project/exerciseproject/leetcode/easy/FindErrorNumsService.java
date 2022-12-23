package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class FindErrorNumsService {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> acc = new HashSet<>();
        int additional = -1;
        int missing = -1;

        for (int i = 0; i < nums.length; i++) {
            if (acc.contains(nums[i])) {
                additional = nums[i];
            } else {
                acc.add(nums[i]);
            }
        }

        for (int i = 1; i < nums.length+1; i++) {
            if (!acc.contains(i)) {
                missing = i;
            }
        }

        return new int[]{additional, missing};
    }
}
