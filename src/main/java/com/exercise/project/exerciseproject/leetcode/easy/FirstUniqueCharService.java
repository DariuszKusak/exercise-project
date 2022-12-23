package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class FirstUniqueCharService {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, List<Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                List<Integer> integers = map.get(s.charAt(i));
                integers.add(i);
                map.put(s.charAt(i), integers);
            } else {
                List<Integer> integers = new ArrayList<>();
                integers.add(i);
                map.put(s.charAt(i), integers);
            }
        }

        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                return entry.getValue().get(0);
            }
        }

        return -1;
    }
}
