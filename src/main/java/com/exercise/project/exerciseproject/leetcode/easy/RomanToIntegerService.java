package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RomanToIntegerService {

    public int romanToInt(String s) {
        Map<Character, Integer> dictionary = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int sum = 0;
        int prev = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            int current = dictionary.get(s.charAt(i));

            if (current < prev) {
                sum -= current;
            } else {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }

    public int romanToIntV2(String s) {
        Map<Character, Integer> dictionary = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int factor = 1;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                sum += dictionary.get(s.charAt(s.length() - 1)) * factor;
            } else {
                int now = dictionary.get(s.charAt(i));
                int next = dictionary.get(s.charAt(i + 1));

                if (now == next) {
                    factor++;
                } else if (now > next) {
                    sum += now * factor;
                    factor = 1;
                } else {
                    sum -= now * factor;
                    factor = 1;
                }
            }
        }
        return sum;
    }


}

