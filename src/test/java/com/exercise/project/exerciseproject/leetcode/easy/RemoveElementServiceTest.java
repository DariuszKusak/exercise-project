package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.RemoveElementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RemoveElementServiceTest {

    @Autowired
    RemoveElementService service;

    @Test
    void removeElement() {
//        int[] arr = new int[]{0,1,2,2,3,0,4,2};
//        int[] arr = new int[]{1};
        int[] arr = new int[]{2,2,3};

        service.removeElement(arr, 2);
    }
}