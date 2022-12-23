package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class HappyNumberService {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (true) {
            int i = sumSquare(n);
            if (i == 1) {
                return true;
            } else {
                if (seen.contains(i)) {
                    return false;
                } else {
                    seen.add(i);
                    n = i;
                }
            }
        }
    }

    private int sumSquare(int n) {
            List<Integer> list = new ArrayList<>();

            while (n > 9) {
                list.add(n % 10);
                n = n / 10;
            }
            list.add(n);


            return list
                    .stream()
                    .mapToInt(i -> i * i)
                    .sum();
        }

    }





