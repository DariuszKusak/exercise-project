package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FindMaxAverageService {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;

        int left = 0;
        int right = k - 1;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int tmpSum = maxSum;

        while (right < nums.length -1) {
            right++;
            tmpSum = tmpSum - nums[left];
            tmpSum = tmpSum + nums[right];
            maxSum = Math.max(maxSum, tmpSum);
            left++;
        }

        return (double) maxSum / k;
    }
}
