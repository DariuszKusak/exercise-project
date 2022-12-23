package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class ReverseWordsService {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(word -> {
                    StringBuilder sb = new StringBuilder(word);
                    sb.reverse();
                    return sb.toString();
                })
                .collect(Collectors.joining(" "));
    }
}
