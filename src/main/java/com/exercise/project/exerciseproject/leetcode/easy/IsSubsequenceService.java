package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class IsSubsequenceService {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }

        int leftPointer = 0;
        int rightPointer = 0;

        while (leftPointer < s.length() && rightPointer < t.length()) {
            if (s.charAt(leftPointer) == t.charAt(rightPointer)) {
                if (leftPointer == s.length()-1) {
                    return true;
                } else {
                    leftPointer++;
                }
            }
            rightPointer++;
        }
        return false;
    }
}
