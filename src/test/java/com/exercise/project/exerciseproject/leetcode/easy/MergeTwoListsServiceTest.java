package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MergeTwoListsServiceTest {

    @Autowired
    MergeTwoListsService service;

    @Test
    void mergeTwoLists() {


//        ListNode l3 = new ListNode(4, null);
//        ListNode l2 = new ListNode(2, l3);
//        ListNode l1 = new ListNode(1, l2);
//
//        ListNode r3 = new ListNode(4, null);
//        ListNode r2 = new ListNode(3, r3);
//        ListNode r1 = new ListNode(1, r2);

        ListNode l7 = new ListNode(6, null);
        ListNode l6 = new ListNode(6, l7);
        ListNode l5 = new ListNode(1, l6);
        ListNode l4 = new ListNode(-4, l5);
        ListNode l3 = new ListNode(-9, l4);
        ListNode l2 = new ListNode(-10, l3);
        ListNode l1 = new ListNode(-10, l2);

        ListNode r1 = new ListNode(-7, null);

        service.mergeTwoLists(l1, r1);

    }
}