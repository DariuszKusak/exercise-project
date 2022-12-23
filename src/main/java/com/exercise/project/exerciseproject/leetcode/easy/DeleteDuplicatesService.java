package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

@Service
public class DeleteDuplicatesService {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;

        while (head != null) {
            if (head.next != null) {
                if (head.val == head.next.val) {
                    head.next = head.next.next;
                } else {
                    head = head.next;
                }
            } else {
                head = null;
            }
        }
        return result;
    }

}
