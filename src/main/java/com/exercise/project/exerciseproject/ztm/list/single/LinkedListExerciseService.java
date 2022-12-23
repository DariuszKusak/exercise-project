package com.exercise.project.exerciseproject.ztm.list.single;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

@Service
public class LinkedListExerciseService {

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    public ListNode reverseBetween(ListNode head, int left, int right) {
        int currentPosition = 1;
        ListNode currentNode = head;
        ListNode start = head;
        ListNode reversedList = null;
        ListNode tail;

        while (currentPosition < left) {
            start = currentNode;
            currentNode = currentNode.next;
            currentPosition++;
        }

        tail = currentNode;

        while (currentPosition >= left && currentPosition <= right) {
            ListNode next = currentNode.next;
            currentNode.next = reversedList;
            reversedList = currentNode;
            currentNode = next;
            currentPosition++;
        }

        start.next = reversedList;
        tail.next = currentNode;

        return head;
    }

    public void print(ListNode listNode) {
        ListNode head = listNode;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println("===");
    }

}

