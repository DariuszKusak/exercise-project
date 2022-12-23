package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FindComplementService {
    public int findComplement(int num) {
        return Integer.parseInt(Integer.toBinaryString(num)
                .replaceAll("0", "x")
                .replaceAll("1", "0")
                .replaceAll("x", "1"), 2);
    }

}
