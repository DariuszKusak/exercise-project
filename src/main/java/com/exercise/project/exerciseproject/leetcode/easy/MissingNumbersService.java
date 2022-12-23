package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MissingNumbersService {
    public int missingNumber(int[] nums) {
        Set<Integer> storage = IntStream.rangeClosed(0, nums.length).boxed().collect(Collectors.toSet());
        for (int i = 0; i < nums.length; i++) {
            storage.remove(nums[i]);
        }

        return storage.iterator().next();
    }

}
