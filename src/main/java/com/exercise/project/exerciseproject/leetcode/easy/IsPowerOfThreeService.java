package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class IsPowerOfThreeService {
    public boolean isPowerOfThree(int n) {
        return n == 1 || Integer.toString(n, 3).matches("10+");
    }
}
