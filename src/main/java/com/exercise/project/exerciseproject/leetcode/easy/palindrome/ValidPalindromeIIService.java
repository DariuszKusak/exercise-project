package com.exercise.project.exerciseproject.leetcode.easy.palindrome;

import org.springframework.stereotype.Service;

@Service
public class ValidPalindromeIIService {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return  valid(s.substring(left+1, right+1)) || valid(s.substring(left, right));
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean valid(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
