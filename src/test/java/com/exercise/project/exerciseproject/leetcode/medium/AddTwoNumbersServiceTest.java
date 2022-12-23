package com.exercise.project.exerciseproject.leetcode.medium;

import com.exercise.project.exerciseproject.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddTwoNumbersServiceTest {

    @Autowired
    AddTwoNumbersService service;

    @Test
    void addTwoNumbers() {
        ListNode n3 = new ListNode(3, null);
        ListNode n2 = new ListNode(4, n3);
        ListNode n1 = new ListNode(2, n2);

        ListNode m3 = new ListNode(4, null);
        ListNode m2 = new ListNode(6, m3);
        ListNode m1 = new ListNode(5, m2);


        assertEquals(null, service.addTwoNumbers(n1, m1));
    }

}