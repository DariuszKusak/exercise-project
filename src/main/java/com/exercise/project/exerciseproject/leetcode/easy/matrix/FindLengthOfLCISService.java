package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.springframework.stereotype.Service;

@Service
public class FindLengthOfLCISService {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int longestArraySize = 0;
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] <= nums[right - 1]) {
                longestArraySize = Math.max(longestArraySize, right - left);
                left = right;
            } else if (right == nums.length - 1) {
                longestArraySize = Math.max(longestArraySize, right - left + 1);
            }
            right++;
        }

        return longestArraySize;
    }
}
