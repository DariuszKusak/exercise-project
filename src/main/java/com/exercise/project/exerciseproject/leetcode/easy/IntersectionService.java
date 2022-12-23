package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class IntersectionService {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> results = new HashSet<>();

        if (nums1.length > nums2.length) {
            Set<Integer> storage = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            for (int i = 0; i < nums2.length; i++) {
                if (storage.contains(nums2[i])) {
                    results.add(nums2[i]);
                }
            }
        } else {
            Set<Integer> storage = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            for (int i = 0; i < nums1.length; i++) {
                if (storage.contains(nums1[i])) {
                    results.add(nums1[i]);
                }
            }
        }

        return results.stream().mapToInt(i -> i).toArray();
    }
}
