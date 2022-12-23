package com.exercise.project.exerciseproject.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysIIService {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> results = new ArrayList<>();

        if (nums1.length > nums2.length) {
            Map<Integer, Long> storage = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
            for (int i = 0; i < nums2.length; i++) {
                if (storage.containsKey(nums2[i]) && storage.get(nums2[i]) > 0) {
                    results.add(nums2[i]);
                    storage.put(nums2[i], storage.get(nums2[i]) - 1);
                }
            }
        } else {
            Map<Integer, Long> storage = Arrays.stream(nums2).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
            for (int i = 0; i < nums1.length; i++) {
                if (storage.containsKey(nums1[i]) && storage.get(nums1[i]) > 0) {
                    results.add(nums1[i]);
                    storage.put(nums1[i], storage.get(nums1[i]) - 1);
                }
            }
        }

        return results.stream().mapToInt(i -> i).toArray();
    }
}
