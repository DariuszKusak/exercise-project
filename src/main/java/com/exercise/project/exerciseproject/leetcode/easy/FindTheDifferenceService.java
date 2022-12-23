package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FindTheDifferenceService {
    public char findTheDifference(String s, String t) {
        Set<Character> storage = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
            } else {
                if (storage.contains(s.charAt(i))) {
                    storage.remove(s.charAt(i));
                } else {
                    storage.add(s.charAt(i));
                }
                if (storage.contains(t.charAt(i))) {
                    storage.remove(t.charAt(i));
                } else {
                    storage.add(t.charAt(i));
                }
            }

        }
        if (storage.contains(t.charAt(t.length() - 1))) {
            storage.remove(t.charAt(t.length() - 1));
        } else {
            storage.add(t.charAt(t.length() - 1));
        }

        return storage.stream().findFirst().orElse(null);
    }
}
