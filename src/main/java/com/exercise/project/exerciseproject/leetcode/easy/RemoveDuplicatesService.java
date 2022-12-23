package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class RemoveDuplicatesService {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int lastValue = nums[0];
        int lastIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastValue) {
                lastValue = nums[i];
                nums[lastIndex] = lastValue;
                lastIndex++;
            }
        }

        return lastIndex;
    }

}
