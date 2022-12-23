package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class IsPerfectSquareService {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        return isPerfectSquare(2, num, num);
    }

    private boolean isPerfectSquare(int left, int right, int num) {
        if (left < right) {
            int middle = (left + right) / 2;
            if (middle * middle == num) {
                return true;
            } else if (middle * middle > num) {
                return isPerfectSquare(left, middle, num);
            } else {
                return isPerfectSquare(middle + 1, right, num);
            }
        }
        return false;
    }


    public boolean isPerfectSquareV2(int num) {
        if (num == 1) {
            return true;
        }

        double start = 2;

        while (start < (num / start)) {
            start++;
        }
        return start == (num / start);
    }
}
