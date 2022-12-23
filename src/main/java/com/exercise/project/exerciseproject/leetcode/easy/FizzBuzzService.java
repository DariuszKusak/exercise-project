package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class FizzBuzzService {
    public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> {
                    String result = String.valueOf(i);
                    if (i % 3 == 0 || i % 5 == 0) {
                        result = "";
                        if (i % 3 == 0) {
                            result += "Fizz";
                        }
                        if (i % 5 == 0) {
                            result += "Buzz";
                        }
                        return result;
                    }
                    return result;
                })
                .collect(Collectors.toList());
    }
}
