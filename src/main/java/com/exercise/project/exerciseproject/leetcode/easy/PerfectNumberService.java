package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfectNumberService {
    public boolean checkPerfectNumber(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).sum() == num;
    }
}
