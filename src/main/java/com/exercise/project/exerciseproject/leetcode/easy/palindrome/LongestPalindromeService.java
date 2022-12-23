package com.exercise.project.exerciseproject.leetcode.easy.palindrome;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class LongestPalindromeService {
    public int longestPalindrome(String s) {
        var collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        var sum = 0;
        var onlyOneOddNumber = false;

        for (Map.Entry<String, Long> entry : collect.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                sum += entry.getValue();
            } else {
                sum += entry.getValue() - 1;
                if (!onlyOneOddNumber) {
                    sum++;
                    onlyOneOddNumber = true;
                }
            }
        }
        return sum;
    }
}
