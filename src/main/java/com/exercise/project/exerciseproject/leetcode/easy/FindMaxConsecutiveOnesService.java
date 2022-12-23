package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FindMaxConsecutiveOnesService {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tmp++;
            } else {
                if (tmp > max) {
                    max = tmp;
                }
                tmp = 0;
            }
        }

        return Math.max(tmp, max);
    }
}
