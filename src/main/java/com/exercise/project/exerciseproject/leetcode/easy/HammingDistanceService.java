package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class HammingDistanceService {
    public int hammingDistance(int x, int y) {
        String xBinary = Integer.toBinaryString(x);
        String yBinary = Integer.toBinaryString(y);

        int xPointer = xBinary.length() - 1;
        int yPointer = yBinary.length() - 1;

        int counter = 0;

        while (xPointer >= 0 || yPointer >= 0) {
            if (xPointer >= 0 && yPointer >= 0) {
                if (xBinary.charAt(xPointer) != yBinary.charAt(yPointer)) {
                    counter++;
                }
                xPointer++;
                yPointer++;
            } else if (xPointer >= 0) {
                counter++;
                xPointer++;
            } else {
                counter++;
                yPointer++;
            }
        }
        return counter;
    }
}
