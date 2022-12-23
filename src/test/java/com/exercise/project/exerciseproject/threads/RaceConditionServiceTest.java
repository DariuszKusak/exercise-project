package com.exercise.project.exerciseproject.threads;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class RaceConditionServiceTest {

    @Test
    void compute() {
        assertNotEquals(0, RaceConditionService.compute(50000));
    }

    @Test
    void computeSynchronized() throws InterruptedException {
        assertEquals(0, RaceConditionService.computeSynchronized(50000));
    }

    @Test
    void computeAtomic() throws InterruptedException {
        assertEquals(0, RaceConditionService.computeAtomic(50000));
    }

}