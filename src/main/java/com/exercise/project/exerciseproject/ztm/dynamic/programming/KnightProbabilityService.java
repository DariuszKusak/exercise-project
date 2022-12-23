package com.exercise.project.exerciseproject.ztm.dynamic.programming;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class KnightProbabilityService {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] directions = new int[][]{
                new int[]{-2, 1},
                new int[]{-1, 2},
                new int[]{1, 2},
                new int[]{2, 1},
                new int[]{2, -1},
                new int[]{1, -2},
                new int[]{-1, -2},
                new int[]{-2, -1}
        };

        return probability(n, k, row, column, directions, new HashMap<>());
    }

    private double probability(int n, int k, int row, int column, int[][] directions, Map<Field, Double> cache) {
        if (row < 0 || column < 0 || row >= n || column >= n) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        double response = 0;

        for (int[] direction : directions) {
            Field nextField = new Field(row + direction[0], column + direction[1], k-1);

            if (cache.containsKey(nextField)) {
                response += cache.get(nextField);
            } else {
                double prob = probability(n, k - 1, nextField.row(), nextField.column(), directions, cache) / 8;
                cache.put(nextField, prob);
                response += prob;
            }
        }

        return response;
    }

    record Field(int row, int column, int k) {
    }

}
