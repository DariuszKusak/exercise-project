package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class FindContentChildrenService {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gPointer = 0;
        int sPointer = 0;

        while (gPointer < g.length || sPointer < s.length) {
            if (gPointer < g.length && sPointer < s.length) {
                if (g[gPointer] <= s[sPointer]) {
                    gPointer++;
                }
                sPointer++;
            } else {
                break;
            }
        }

        return gPointer;
    }
}
