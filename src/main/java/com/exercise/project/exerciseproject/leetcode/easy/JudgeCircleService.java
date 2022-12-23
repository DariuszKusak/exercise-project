package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JudgeCircleService {
    public boolean judgeCircle(String moves) {
        Map<String, Long> collect = Arrays.stream(moves.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return  collect.getOrDefault("U", 0L).longValue() == collect.getOrDefault("D", 0L).longValue() &&
                collect.getOrDefault("L", 0L).longValue() == collect.getOrDefault("R", 0L).longValue();
    }
}
