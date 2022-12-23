package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FindAllNumbersDisappearedInArrayService {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }
}
