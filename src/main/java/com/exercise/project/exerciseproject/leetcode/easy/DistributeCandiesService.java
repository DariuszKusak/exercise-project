package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DistributeCandiesService {
    public int distributeCandies(int[] candyType) {
        int allowed = candyType.length / 2;
        int candyTypes = (int) Arrays.stream(candyType).boxed().distinct().count();

        return Math.min(candyTypes, allowed);
    }
}
