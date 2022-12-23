package com.exercise.project.exerciseproject.algo;

import org.springframework.stereotype.Service;

@Service
public class SearchRangeService {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && target == nums[0]) {
            return new int[]{0, 0};
        }

        int i = find(nums, 0, nums.length - 1, target);

        return new int[]{findNPreviousValue(nums, i), findNextValue(nums, i)};
    }

    private int findNextValue(int[] nums, int index) {
        if (index == 1 ) {
            return -1;
        }
        if (index == nums.length - 1) {
            return index;
        }
        if (nums[index + 1] == nums[index]) {
            return findNextValue(nums, index + 1);

        }
        return index;
    }

    private int findNPreviousValue(int[] nums, int index) {
        if (index == 1 ) {
            return -1;
        }
        if (index == 0) {
            return index;
        }
        else if (nums[index - 1] == nums[index]) {
            return findNPreviousValue(nums, index - 1);

        } else {
            return index;
        }

    }


    private int find(int[] nums, int left, int right, int target) {
        if (left <= right) {
            if (left == right) {
                return nums[left] == target ? left : -1;
            } else {
                int middle = (right + left) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < target) {
                    return find(nums, middle + 1, right, target);
                } else {
                    return find(nums, left, middle - 1, target);
                }
            }
        }
        return -1;
    }

}
