package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class GuessNumberService {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }

        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                right = mid ;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }


    private int guess(int num) {
        return -1;
    }

}
