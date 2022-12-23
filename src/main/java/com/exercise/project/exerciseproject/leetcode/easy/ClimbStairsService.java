package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ClimbStairsService {
    public int climbStairs(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(1, 1);
        cache.put(2, 2);

        return climbStairs(n, cache);
    }

    private int climbStairs(int n, Map<Integer, Integer> cache) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        cache.put(n, climbStairs(n - 1, cache) + climbStairs(n - 2, cache));
        return cache.get(n);
    }


}
