package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PowerOfTwoService {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

    public boolean isPowerOfTwoV2(int n) {
        return n > 0 &&
                Arrays.stream(Integer.toBinaryString(n).split(""))
                        .filter(digitAsString -> digitAsString.equals("1"))
                        .count() == 1;
    }
}
