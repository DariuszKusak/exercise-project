package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.springframework.stereotype.Service;

@Service
public class ReverseStrService {
    public String reverseStr(String s, int k) {
        boolean reverse = true;
        int tmp = 0;
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (tmp == k) {
                if (reverse) {
                    temp.reverse();
                }
                result.append(temp);
                temp = new StringBuilder();
                reverse = !reverse;
                tmp = 0;
            }

            temp.append(s.charAt(i));
            tmp++;
        }

        if (!temp.isEmpty()) {
            if (reverse) {
                temp.reverse();
            }
            result.append(temp);
        }

        return result.toString();
    }
}
