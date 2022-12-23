package com.exercise.project.exerciseproject.sorting;

import com.exercise.project.exerciseproject.ztm.sorting.FindKthLargestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindKthLargestServiceTest {

    @Autowired
    FindKthLargestService service;

    @Test
    void testFindKthLargest() {

        assertEquals(5, service.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        service.findKthLargest(new int[]{2,1}, 2);
        service.findKthLargest(new int[]{-1,2,0}, 2);
    }
}