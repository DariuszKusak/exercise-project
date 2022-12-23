package com.exercise.project.exerciseproject.ztm.sorting;

import org.springframework.stereotype.Service;

@Service
public class FindKthLargestService {
    public int findKthLargest(int[] nums, int k) {
        if (k > nums.length) {
            throw new IllegalArgumentException();
        }
        if (nums.length == 1) {
            return nums[0];
        }
        System.out.println();

        return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
    }

    int findKthLargest(int[] nums, int left, int right, int findIndex) {
        int positionIndex = left;
        int pivotElement = nums[right];

        for (int i = left; i < right; i++) {
            if (nums[i] < pivotElement) {
                swap(nums, i, positionIndex);
                positionIndex++;
            }
        }
        swap(nums, positionIndex, right);

        if (findIndex == positionIndex) {
            return nums[positionIndex];
        } else if (positionIndex > findIndex) {
            return findKthLargest(nums, left, positionIndex - 1, findIndex);
        } else {
            return findKthLargest(nums, positionIndex + 1, right, findIndex);
        }
    }

    private int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }


}



