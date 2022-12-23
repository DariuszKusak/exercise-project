package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class MaxProfitService {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int lowestPrice = prices[0];
        int bestSale = Integer.MIN_VALUE;

        for (int i=1; i<prices.length;i++) {
            if (prices[i] - lowestPrice > bestSale) {
                bestSale = prices[i] - lowestPrice;
            }
            if (lowestPrice > prices[i]) {
                lowestPrice = prices[i];
            }
        }

        return Math.max(bestSale, 0);
    }
}
