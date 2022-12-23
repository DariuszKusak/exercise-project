package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WordPatternService {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> dictionary = new HashMap<>();
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            if (dictionary.containsKey(pattern.charAt(i))) {
                if (!dictionary.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (dictionary.containsValue(words[i])) {
                    return false;
                }
                dictionary.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }
}
