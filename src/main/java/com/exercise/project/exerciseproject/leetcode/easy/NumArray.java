package com.exercise.project.exerciseproject.leetcode.easy;

public class NumArray {
    private final long[] sums;

    public NumArray(int[] nums) {
        this.sums = new long[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }

    }

    public int sumRange(int left, int right) {
        return (int) (left == 0 ? sums[right] : sums[right] - sums[left - 1]);
    }
}
