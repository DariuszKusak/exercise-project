package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class AddDigitsService {
    public int addDigits(int num) {
        while (num > 9) {
            num = addDigitsOneIteration(num);
        }

        return num;
    }

    private int addDigitsOneIteration(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num = num / 10;
        }
        sum += num;
        return sum;
    }

    public int addDigitsV2(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
