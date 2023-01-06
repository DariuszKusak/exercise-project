package com.exercise.project.exerciseproject.searching;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BinarySearchService {

    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        return find(nums, 0, nums.length - 1, target);
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
