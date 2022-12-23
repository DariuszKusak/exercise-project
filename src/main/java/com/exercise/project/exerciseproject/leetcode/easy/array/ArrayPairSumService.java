package com.exercise.project.exerciseproject.leetcode.easy.array;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArrayPairSumService {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }

        return sum;
    }
}
