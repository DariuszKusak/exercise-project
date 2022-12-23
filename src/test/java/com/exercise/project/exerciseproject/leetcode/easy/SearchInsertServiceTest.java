package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.SearchInsertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchInsertServiceTest {

    @Autowired
    SearchInsertService service;

    @Test
    void searchInsert() {

//        int[] tab = new int[]{1,3,5,6};
        int[] tab = new int[]{3,5,7,9,10};

        System.out.println(service.searchInsert(tab, 8));

    }
}