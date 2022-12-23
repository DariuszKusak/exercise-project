package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class ExcelSheetColumnNumberService {

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int multiply = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            sum += Math.pow(26, multiply) *  ((int) columnTitle.charAt(i) - 64);
            multiply++;
        }

        return sum;
    }

}
