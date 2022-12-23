package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class SearchInsertService {

    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length - 1, target);
    }

    private int searchInsert(int nums[], int left, int right, int target) {
        if (left <= right) {
            int middle = (right + left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (left == right) {
                return nums[left] > target ? left : left + 1;
            } else {
                return nums[middle] > target ? searchInsert(nums, left, middle - 1, target) : searchInsert(nums, middle + 1, right, target);
            }
        } else {
            return left;
        }
    }
}
