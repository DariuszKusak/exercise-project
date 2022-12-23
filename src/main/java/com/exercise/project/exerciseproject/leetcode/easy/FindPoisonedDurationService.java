package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FindPoisonedDurationService {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int sum = 0;
        int lastTo = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i] > lastTo) {
                sum += duration;
                lastTo = timeSeries[i] + duration;
            } else {
                sum = sum + timeSeries[i] + duration - lastTo;
                lastTo = timeSeries[i] + duration;
            }
        }

        return sum;
    }
}
