package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class PalindromeNumberService {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int revertedHalfNumber = 0;
            while (x > revertedHalfNumber) {
                revertedHalfNumber = revertedHalfNumber * 10 + x % 10;
                x = x / 10;
            }

            return x == revertedHalfNumber || x == revertedHalfNumber / 10;
        }
    }
}
