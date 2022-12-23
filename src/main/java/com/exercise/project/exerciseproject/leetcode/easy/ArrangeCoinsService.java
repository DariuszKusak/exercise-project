package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class ArrangeCoinsService {
    public int arrangeCoins(int n) {

        int stairs = 0;

        while (n > 0) {
            n = n - (stairs + 1);
            if (n >= 0) {
                stairs++;
            }
        }

        return stairs;
    }

}
