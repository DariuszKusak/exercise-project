package com.exercise.project.exerciseproject.array;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ArrayExercisesService {
    public void printAllArrayPairs(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[i] + " | " + data[j]);
            }
        }
    }

    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSumBrute(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        if (nums.length == 2) {
            return nums[0] + nums[1] == target ? new int[]{0, 1} : null;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        if (nums.length == 2) {
            return nums[0] + nums[1] == target ? new int[]{0, 1} : null;
        }

        HashMap<Integer, Integer> storage = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (storage.containsKey(nums[i])) {
                return new int[]{storage.get(nums[i]), i};
            } else {
                storage.put(target - nums[i], i);
            }
        }
        return null;
    }

    // You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    // Find two lines that together with the x-axis form a container, such that the container contains the most water.
    // Return the maximum amount of water a container can store.
    // Notice that you may not slant the container.
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;

        if (height == null || height.length < 2) {
            return 0;
        }
        if (height.length == 2) {
            return (Math.min(height[0], height[1]));
        }

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * (Math.min(height[i], height[j]));
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        if (height.length == 2) {
            return (Math.min(height[0], height[1]));
        }
        int tempArea;
        int maxArea = 0;
        int leftShifter = 0;
        int rightShifter = height.length - 1;

        while (leftShifter < rightShifter) {
            if (height[leftShifter] < height[rightShifter]) {
                tempArea = height[leftShifter] * (rightShifter - leftShifter);
                leftShifter++;
            } else {
                tempArea = height[rightShifter] * (rightShifter - leftShifter);
                rightShifter--;
            }
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }
        }
        return maxArea;
    }

    public int trap(int[] height) {
        int sum = 0;
        if (height == null || height.length < 3) {
            return 0;
        }
        for (int i = 1; i < height.length - 1; i++) {
            int left = height[i - 1];
            int right = height[i + 1];

            if (height[i] < left && height[i] < right) {
                sum += Math.min(left, right) - height[i];
            } else if (height[i] < left) {
                for (int j=i+1; j<height.length; j++) {
                    if (height[i] < height[j]) {
                        sum += height[j];
                        break;
                    }
                }

            }

        }
        return sum;
    }
}
