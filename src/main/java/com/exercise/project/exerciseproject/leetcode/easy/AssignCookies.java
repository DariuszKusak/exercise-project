package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int counter = 0;

        while (i < g.length && j < s.length && i <= j) {
            if (g[i] <= s[j]) {
                counter++;
                i++;
            }
            j++;
        }

        return counter;
    }
}
