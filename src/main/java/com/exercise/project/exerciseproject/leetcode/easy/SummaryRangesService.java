package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SummaryRangesService {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        if (nums.length == 1) {
            return Collections.singletonList("" + nums[0]);
        }

        List<String> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1] + 1) {
                    result.add("" + nums[i]);
                } else {
                    result.add(tmp.get(0) + "->" + nums[i]);
                }
            } else {
                if (nums[i + 1] != nums[i] + 1) {
                    result.add(tmp.isEmpty() ? "" + nums[i] : tmp.get(0) + "->" + nums[i]);
                    tmp = new ArrayList<>();
                } else {
                    tmp.add(nums[i]);
                }
            }
        }

        return result;
    }
}
