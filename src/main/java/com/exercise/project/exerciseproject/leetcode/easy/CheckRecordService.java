package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CheckRecordService {
    public boolean checkRecord(String s) {
        return !s.contains("LLL") &&
                Arrays.stream(s.split("")).filter(str -> str.equals("A")).count() <= 1;
    }

}
