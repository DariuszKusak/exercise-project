package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ValidAnagramService {
    public boolean isAnagram(String s, String t) {
        return s.length() == t.length() &&
                s.chars().boxed().sorted().toList()
                        .equals(t.chars().boxed().sorted().collect(Collectors.toList()));
    }
}
