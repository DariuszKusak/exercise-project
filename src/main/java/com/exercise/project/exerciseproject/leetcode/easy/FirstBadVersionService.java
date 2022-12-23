package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FirstBadVersionService {

    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                return firstBadVersion(left, middle);
            } else {
                return firstBadVersion(middle + 1, right);
            }
        }
        return left;
    }


    private boolean isBadVersion(int n) {
        return n == 4;
    }

}
