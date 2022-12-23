package com.exercise.project.exerciseproject.algo;

import org.springframework.stereotype.Service;

@Service
public class BinarySearchService {

    public int recursive(int[] nums, int target) {
        return recursive(nums, 0, nums.length - 1, target);
    }

    private int recursive(int[] nums, int left, int right, int target) {
        if (left <= right) {
            if (left == right) {
                return nums[left] == target ? left : -1;
            } else {
                int middle = (right + left) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < target) {
                    return recursive(nums, middle + 1, right, target);
                } else {
                    return recursive(nums, left, middle - 1, target);
                }
            }
        }
        return -1;
    }

    public int incremental(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
