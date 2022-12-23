package com.exercise.project.exerciseproject.leetcode.medium;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

@Service
public class AddTwoNumbersService {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0, null);
        ListNode pointer = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            pointer.next = new ListNode(sum%10);
            pointer = pointer.next;
            if (sum > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        return result.next;
    }
}
