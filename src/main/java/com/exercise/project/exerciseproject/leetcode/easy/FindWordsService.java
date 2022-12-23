package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FindWordsService {
    public String[] findWords(String[] words) {
        Set<String> firstRow = Set.of("q", "w", "e", "r", "t", "y", "u", "i", "o", "p");
        Set<String> secondRow = Set.of("a", "s", "d", "f", "g", "h", "j", "k", "l");
        Set<String> thirdRow = Set.of("z", "x", "c", "v", "b", "n", "m");

        return Arrays.stream(words)
                .filter(word -> {
                    Set<String> wordAsSet = Arrays.stream(word.split("")).map(String::toLowerCase).collect(Collectors.toSet());
                    return firstRow.containsAll(wordAsSet) || secondRow.containsAll(wordAsSet) || thirdRow.containsAll(wordAsSet);
                })
                .toArray(String[]::new);
    }
}
