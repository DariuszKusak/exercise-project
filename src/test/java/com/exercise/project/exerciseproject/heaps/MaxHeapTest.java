package com.exercise.project.exerciseproject.heaps;

import com.exercise.project.exerciseproject.ztm.heaps.HeapComparator;
import com.exercise.project.exerciseproject.ztm.heaps.MaxHeap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MaxHeapTest {

    @Autowired
    MaxHeap service;
    @Autowired
    HeapComparator comparator;

    @Test
    void add() {
        MaxHeap heap = new MaxHeap(List.of(25, 50,75,45), comparator);
        heap.print();

        heap.pop();
        heap.print();

        heap.push(1);
        heap.push(3);
        heap.push(100);
        heap.print();

        heap.pop();
        heap.pop();
        heap.print();
    }


}