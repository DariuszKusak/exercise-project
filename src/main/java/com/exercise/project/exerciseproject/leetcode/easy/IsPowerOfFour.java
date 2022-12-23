package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class IsPowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n == 1 || Integer.toString(n, 4).matches("10+");
    }
}
