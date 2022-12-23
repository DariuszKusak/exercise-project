package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ToLowerCaseService {
    public String toLowerCase(String s) {
        return s.chars()
                .map(i -> i >= 65 && i <= 90 ? i + 32 : i)
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
    }
}
