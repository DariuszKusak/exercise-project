package com.exercise.project.exerciseproject.ztm.dynamic.programming;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MinCostClimbingStairsService {


    public int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) {
            return 0;
        }
        Map<Integer, Integer> cache = new HashMap<>();

        return Math.min(calculate(cost.length - 1, cost, cache), calculate(cost.length - 2, cost, cache));
    }

    private int calculate(int step, int[] cost, Map<Integer, Integer> cache) {
        if (step < 0) {
            return 0;
        }
        if (step == 0 || step == 1) {
            return cost[step];
        }

        int prev;
        int prePrev;

        if (cache.containsKey(step - 1)) {
            prev = cache.get(step - 1);
        } else {
            prev = calculate(step - 1, cost, cache);
            cache.put(step - 1, prev);
        }

        if (cache.containsKey(step - 2)) {
            prePrev = cache.get(step - 2);
        } else {
            prePrev = calculate(step - 2, cost, cache);
            cache.put(step - 2, prePrev);
        }

        return cost[step] + Math.min(prev, prePrev);
    }


}
