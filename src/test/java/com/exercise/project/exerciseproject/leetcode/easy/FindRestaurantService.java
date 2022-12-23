package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FindRestaurantService {
    public String[] findRestaurant(String[] list1, String[] list2) {
        TreeMap<Integer, List<String>> results = new TreeMap<>();
        Map<String, Integer> list2AsMap = new HashMap<>();

        for (int i = 0; i < list2.length; i++) {
            list2AsMap.put(list2[i], i);
        }

        for (int i = 0; i < list1.length; i++) {
            if (list2AsMap.containsKey(list1[i])) {
                int commonIndex = i + list2AsMap.get(list1[i]);
                if (results.containsKey(commonIndex)) {
                    results.put(commonIndex, Stream.concat(results.get(commonIndex).stream(), Stream.of(list1[i])).collect(Collectors.toList()));
                } else {
                    results.put(commonIndex, new ArrayList<>(List.of(list1[i])));
                }

            }
        }

        String[] res = new String[results.firstEntry().getValue().size()];
        for (int i = 0; i < results.firstEntry().getValue().size(); i++) {
            res[i] = results.firstEntry().getValue().get(i);
        }

        return res;
    }
}
