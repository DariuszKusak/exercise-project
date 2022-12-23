package com.exercise.project.exerciseproject.leetcode.medium;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaxSubArrayService {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int tmpStart = 0;
        int start = 0;
        int end = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
                start = tmpStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tmpStart = i+1;
            }
        }

        System.out.println(start);
        System.out.println(end);

        return max;
    }
}
