package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class StrStrService {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
