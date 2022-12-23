package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class RemoveElementService {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }

        int reversedPointer = nums.length - 1;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                if (reversedPointer > i) {
                    for (int j = reversedPointer; j > i; j--) {
                        if (nums[j] != val) {
                            reversedPointer = j;
                            nums[i] = nums[reversedPointer];
                            nums[reversedPointer] = val;
                            counter++;
                            break;
                        }
                    }

                }
            } else {
                counter++;
            }
        }
        return counter;
    }
}
