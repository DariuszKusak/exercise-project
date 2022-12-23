package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class LengthsOfWordService {

    public int lengthOfLastWord(String s) {
        boolean started = false;
        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i++) {

            if (!started && s.charAt(i) != ' ') {
                started = true;
                if (i>0) {
                    i--;
                } else {
                    return counter;
                }
            }

            if (started) {
                if (s.charAt(i) == ' ' || i == 0) {
                    return counter;
                } else {
                    counter++;
                }
            }


        }

        return counter;

    }
}
