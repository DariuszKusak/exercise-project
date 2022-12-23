package com.exercise.project.exerciseproject.linked.list.doub;

import com.exercise.project.exerciseproject.model.ListNode;
import com.exercise.project.exerciseproject.ztm.list.doub.DetectCircleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DetectCircleServiceTest {

    @Autowired
    DetectCircleService service;

    @Test
    void detectCycle() {
        ListNode three = new ListNode(-4);
        ListNode two = new ListNode(0);
        two.next = three;
        ListNode one = new ListNode(2);
        one.next = two;
        ListNode head = new ListNode(3);
        head.next = one;
        three.next = one;

//        service.detectCycle(head);
    }
}