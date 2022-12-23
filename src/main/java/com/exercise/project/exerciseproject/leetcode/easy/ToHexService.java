package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class ToHexService {
    public String toHex(int num) {
        return Integer.toString(num, 16);
    }
}
