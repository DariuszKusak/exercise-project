package com.exercise.project.exerciseproject.searching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchRangeServiceTest {

    @Autowired
    SearchRangeService service;

    @Test
    void searchRange() {

        assertArrayEquals(new int[]{3,4}, service.searchRange(new int[]{5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[]{-1,-1}, service.searchRange(new int[]{5,7,7,8,8,10}, 6));
        assertArrayEquals(new int[]{3,4}, service.searchRange(new int[]{5,7,7,8,8,10}, 8));

    }


}