package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class CountSegmentsService {
    public int countSegments(String s) {
        return "".equals(s) ? 0 : s.split("\\s+").length;
    }
}
