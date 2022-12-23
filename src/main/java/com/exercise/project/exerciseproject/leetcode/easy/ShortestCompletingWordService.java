package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ShortestCompletingWordService {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        Map<String, Long> plate = Arrays.stream(licensePlate.split(""))
                .map(String::toLowerCase)
                .filter(letter -> letter.matches("[a-z]"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> sortedWords = Arrays.stream(words).sorted(Comparator.comparingInt(String::length)).toList();


        for (String word : sortedWords) {
            boolean result = true;

            Map<String, Long> counterWord = Arrays.stream(word.split(""))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            for (Map.Entry<String, Long> plateLetter : plate.entrySet()) {
                if (counterWord.get(plateLetter.getKey()) == null || counterWord.get(plateLetter.getKey()) < plateLetter.getValue()) {
                    result = false;
                    break;
                }
            }

            if (result) {
                return word;
            }


        }

        return null;
    }
}
