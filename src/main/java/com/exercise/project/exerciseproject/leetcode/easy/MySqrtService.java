package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class MySqrtService {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (middle == x / middle) {
                return middle;
            } else if (middle > x / middle) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }

}
