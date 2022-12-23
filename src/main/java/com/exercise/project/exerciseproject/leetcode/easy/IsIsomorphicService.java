package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IsIsomorphicService {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> dictionary = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (dictionary.containsKey(s.charAt(i))) {
                if (t.charAt(i) != dictionary.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (dictionary.containsValue(t.charAt(i))) {
                    return false;
                }

                dictionary.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
