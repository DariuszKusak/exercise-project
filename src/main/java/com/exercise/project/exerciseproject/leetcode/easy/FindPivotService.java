package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FindPivotService {
    public int pivotIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
            rightSum -= nums[i+1];
        }

        return leftSum == rightSum
                ? nums.length - 1
                : -1;
    }
}
