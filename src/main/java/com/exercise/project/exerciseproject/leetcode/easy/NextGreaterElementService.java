package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NextGreaterElementService {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> storage = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            storage.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            Integer index = storage.get(nums1[i]);

            int tmp = nums1[i];
            nums1[i] = -1;
            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > tmp) {
                    nums1[i] = nums2[j];
                    break;
                }
            }


        }

        return nums1;
    }
}
