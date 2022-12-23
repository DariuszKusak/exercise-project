package com.exercise.project.exerciseproject;

import com.exercise.project.exerciseproject.array.ArrayExercisesService;
import com.exercise.project.exerciseproject.array.ArrayUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class ExerciseProjectApplication implements CommandLineRunner {
    private final ArrayExercisesService logAllPairsService;

    public static void main(String[] args) {
        SpringApplication.run(ExerciseProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logAllPairsService.printAllArrayPairs(ArrayUtils.provide(1, 3));
    }
}
