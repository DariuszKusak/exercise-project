package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SingleNumberService {

    public int singleNumber(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int i=0; i<nums.length;i++) {
            if (visited.contains(nums[i])) {
                visited.remove(nums[i]);
            } else {
                visited.add(nums[i]);
            }
        }

        return visited.stream().findFirst().orElse(-1);
    }

}
