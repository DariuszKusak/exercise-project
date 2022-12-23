package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

@Service
public class PalindromeLinkedListService {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;


        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }



        return true;
    }
}
