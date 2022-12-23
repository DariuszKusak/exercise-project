package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class RansomNoteService {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] note = ransomNote.toCharArray();
        Map<Character, Long> magazineMap = Arrays.stream(magazine.split("")).map(s -> s.charAt(0)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (int i = 0; i < note.length; i++) {
            if (!magazineMap.containsKey(note[i])) {
                return false;
            }
            Long aLong = magazineMap.get(note[i]);
            if (aLong < 1) {
                return false;
            }
            magazineMap.put(note[i], aLong - 1);
        }

        return true;
    }
}
