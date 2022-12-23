package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LinkedListCycleService {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> storage = new HashSet<>();

        while (head.next != null) {
            if (storage.contains(head)) {
                return true;
            } else {
                storage.add(head);
            }
            head = head.next;
        }

        return false;
    }

}
