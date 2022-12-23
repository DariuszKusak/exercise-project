package com.exercise.project.exerciseproject.ztm.array.single.dimentional;

import org.springframework.stereotype.Service;

@Service
public class TrappingRainWaterService {
    public int trap(int[] height) {
        int totalWater = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxLeft = 0;
        int maxRight = height[height.length - 1];

        while (leftPointer < rightPointer) {

            if (maxLeft <= maxRight) {
                //move left pointer
                if (height[leftPointer] > maxLeft) {
                    maxLeft = height[leftPointer];
                } else {
                    totalWater += maxLeft - height[leftPointer];
                }
                if (maxLeft <= maxRight) {
                    leftPointer++;
                }


            } else {
                //move right pointer
                if (height[rightPointer] > maxRight) {
                    maxRight = height[rightPointer];
                } else {
                    totalWater += maxRight - height[rightPointer];
                }
                if (maxLeft > maxRight) {
                    rightPointer--;
                }

            }
        }
        return totalWater;
    }

    public int trapBruteForce(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int totalWater = 0;

        while (left < right) {
            while (left < height.length - 1 && height[left] == height[left + 1]) {
                left++;
            }
            for (int i = left + 1; i <= height.length - 1; i++) {
                if (height[i] - height[left] >= 0) {
                    for (int j = left + 1; j < i; j++) {
                        totalWater = totalWater + height[left] - height[j];
                    }
                    left = i;
                    break;
                }
            }

            if (height[right] == height[right - 1]) {
                right--;
            } else {
                for (int k = right - 1; k >= 0; k--) {
                    if (height[k] - height[right] >= 1) {
                        for (int l = k + 1; l < right; l++) {
                            totalWater = totalWater + height[right] - height[l];
                        }
                        right = k;
                        break;
                    }
                }
            }
        }
        return totalWater;
    }
}
