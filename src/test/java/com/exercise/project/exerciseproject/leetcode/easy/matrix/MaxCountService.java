package com.exercise.project.exerciseproject.leetcode.easy.matrix;

import org.springframework.stereotype.Service;

@Service
public class MaxCountService {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }

        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;

        for (int[] arr : ops) {
            row = Math.min(arr[0], row);
            col = Math.min(arr[1], col);
        }

        return row * col;
    }
}
