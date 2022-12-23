package com.exercise.project.exerciseproject.leetcode.easy.array;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class FindShortestSubArrayService {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long maxDegree = collect.values().stream().mapToLong(l -> l).max().orElse(-1);

        return collect.entrySet().stream().filter(i -> i.getValue() == maxDegree).map(i -> calculateLength(nums, i.getKey())).mapToInt(i -> i).min().orElse(-1);
    }

    private int calculateLength(int nums[], int max) {
        int left = 0;
        int right = nums.length - 1;

        while (nums[left] != max || nums[right] != max) {
            if (nums[left] != max) {
                left++;
            }
            if (nums[right] != max) {
                right--;
            }
        }

        return right - left + 1;
    }

}
