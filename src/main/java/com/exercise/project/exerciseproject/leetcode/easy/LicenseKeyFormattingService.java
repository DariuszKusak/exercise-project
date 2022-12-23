package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class LicenseKeyFormattingService {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter != 0 && counter % k == 0 && s.charAt(i) != '-') {
                sb.append('-');
                counter = 0;
            }

            if (s.charAt(i) != '-') {
                sb.append(s.charAt(i));
                counter++;
            }
        }

        return sb.reverse().toString().toUpperCase();
    }
}
