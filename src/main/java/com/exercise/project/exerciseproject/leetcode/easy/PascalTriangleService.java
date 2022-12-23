package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PascalTriangleService {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                results.add(List.of(1));
            } else if (i == 1) {
                results.add(List.of(1, 1));
            } else {
                List<Integer> tmp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {

                    if (j == 0 || j == i) {
                        tmp.add(1);
                    } else {
                        tmp.add(results.get(i - 1).get(j) + results.get(i - 1).get(j - 1));
                    }
                }
                results.add(tmp);
            }
        }

        return results;
    }

}
