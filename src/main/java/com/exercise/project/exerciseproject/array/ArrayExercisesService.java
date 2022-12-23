package com.exercise.project.exerciseproject.array;

import org.springframework.stereotype.Service;

@Service
public class ArrayExercisesService {
    public void printAllArrayPairs(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[i] + " | " + data[j]);
            }
        }
    }


}
