package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class UglyNumberService {
    public boolean isUgly(int n) {
        if (n==0) {
            return false;
        }

        while (n != -1) {
            n = isUgly2(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private int isUgly2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return n / 2;
        }
        if (n % 3 == 0) {
            return n / 3;
        }
        if (n % 5 == 0) {
            return n / 5;
        }
        return -1;
    }

}
