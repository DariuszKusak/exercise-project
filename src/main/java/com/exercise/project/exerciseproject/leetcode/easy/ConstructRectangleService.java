package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class ConstructRectangleService {
    public int[] constructRectangle(int area) {

        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                return new int[]{Math.max(area / i, i), Math.min(area / i, i)};
            }
        }

        return new int[]{area, 1};
    }
}
