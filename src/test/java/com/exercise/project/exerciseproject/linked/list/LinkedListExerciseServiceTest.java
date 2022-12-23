package com.exercise.project.exerciseproject.linked.list;

import com.exercise.project.exerciseproject.model.ListNode;
import com.exercise.project.exerciseproject.ztm.list.single.LinkedListExerciseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LinkedListExerciseServiceTest {

    @Autowired
    LinkedListExerciseService linkedListExerciseService;

    @Test
    void reverse() {
        ListNode fourth = new ListNode(5, null);
        ListNode third = new ListNode(4, fourth);
        ListNode second = new ListNode(3, third);
        ListNode first = new ListNode(2, second);
        ListNode head = new ListNode(1, first);

        ListNode listNode = linkedListExerciseService.reverseBetween(head, 2, 4);

        linkedListExerciseService.print(listNode);
        System.out.println("===");

        assertEquals(5, linkedListExerciseService.reverseBetween(head, 2, 4));
    }

    @Test
    void reverseBetween() {
        ListNode fourth = new ListNode(5, null);
        ListNode third = new ListNode(4, fourth);
        ListNode second = new ListNode(3, third);
        ListNode first = new ListNode(2, second);
        ListNode head = new ListNode(1, first);

        assertEquals(5, linkedListExerciseService.reverseBetween(head, 2, 4));
    }

    @Test
    void flatten() {

    }

}