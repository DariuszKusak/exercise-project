package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.springframework.stereotype.Service;

@Service
public class AddStringsService {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int remainder = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                int tmp =  Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(j))) + remainder;

                if (tmp > 9) {
                    remainder = 1;
                    result.append((tmp % 10));
                } else {
                    remainder = 0;
                    result.append(tmp);
                }
                i--;
                j--;
            } else if (i >= 0) {
                int tmp = Integer.parseInt(String.valueOf(num1.charAt(i))) + remainder;
                if (tmp > 9) {
                    remainder = 1;
                    result.append((tmp % 10));
                } else {
                    remainder = 0;
                    result.append(tmp);
                }

                i--;
            } else {
                int tmp = Integer.parseInt(String.valueOf(num2.charAt(j))) + remainder;
                if (tmp > 9) {
                    remainder = 1;
                    result.append((tmp % 10));
                } else {
                    remainder = 0;
                    result.append(tmp);
                }

                j--;
            }
        }


        if (remainder == 1) {
            result.append(1);
        }
        result.reverse();

        return result.toString();
    }
}
