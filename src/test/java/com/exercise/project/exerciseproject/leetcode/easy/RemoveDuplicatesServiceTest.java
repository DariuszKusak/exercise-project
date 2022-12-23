package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.RemoveDuplicatesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RemoveDuplicatesServiceTest {

    @Autowired
    RemoveDuplicatesService service;

    @Test
    void removeDuplicates() {
        System.out.println(service.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(service.removeDuplicates(new int[]{1,2}));
//        System.out.println(service.removeDuplicates(new int[]{1,1,2}));
    }
}