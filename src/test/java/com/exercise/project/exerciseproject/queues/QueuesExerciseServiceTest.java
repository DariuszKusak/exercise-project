package com.exercise.project.exerciseproject.queues;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QueuesExerciseServiceTest {

    public void testCustomQueue() {
        CustomQueue<Integer> customQueue = new CustomQueue<>();
        customQueue.enqueue(1);
        customQueue.enqueue(2);
        customQueue.enqueue(3);
        customQueue.dequeue();
        customQueue.enqueue(4);
        customQueue.enqueue(5);
        customQueue.enqueue(6);
        customQueue.enqueue(7);
        customQueue.dequeue();
        customQueue.dequeue();
    }

}