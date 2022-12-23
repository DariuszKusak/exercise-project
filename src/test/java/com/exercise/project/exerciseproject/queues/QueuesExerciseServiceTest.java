package com.exercise.project.exerciseproject.queues;

import com.exercise.project.exerciseproject.ztm.queues.CustomQueue;
import org.springframework.boot.test.context.SpringBootTest;

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