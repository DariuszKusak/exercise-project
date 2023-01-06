package com.exercise.project.exerciseproject.searching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BinarySearchServiceTest {

    @Autowired
    private BinarySearchService service;

    @Test
    void findElement() {
//        assertEquals(2, service.search(new int[]{1,2,3,4,5,6,7,8}, 3));
        assertEquals(4, service.search(new int[]{-1,0,3,5,9,12}, 9));

    }
}