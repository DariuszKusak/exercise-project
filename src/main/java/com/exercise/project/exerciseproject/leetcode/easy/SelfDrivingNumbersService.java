package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class SelfDrivingNumbersService {
    public List<Integer> selfDividingNumbers(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .filter(this::isSelfDividing)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean isSelfDividing(int num) {
        for (String numAsString : String.valueOf(num).split("")) {
            if (numAsString.equals("0") || num % Integer.parseInt(numAsString) != 0) {
                return false;
            }
        }
        return true;
    }

}
