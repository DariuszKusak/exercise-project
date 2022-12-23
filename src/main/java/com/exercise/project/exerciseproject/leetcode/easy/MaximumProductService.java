package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MaximumProductService {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1], nums[0] * nums[1] * nums[nums.length - 1]);
    }
}
