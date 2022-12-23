package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class MoveZerosService {
    public void moveZeroes(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        while (rightPointer < nums.length && leftPointer < nums.length) {
            if (nums[rightPointer] != 0) {
                rightPointer++;
            } else if (nums[leftPointer] == 0) {
                leftPointer++;
            } else {
                if (leftPointer < rightPointer) {
                    int temp = leftPointer;
                    leftPointer = rightPointer;
                    rightPointer = temp;
                } else {
                    nums[rightPointer] = nums[leftPointer];
                    nums[leftPointer] = 0;
                }
            }
        }
    }
}
