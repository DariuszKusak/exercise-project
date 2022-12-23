package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

@Service
public class MergeTwoListsService {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head;

        if (list1.val > list2.val) {
            head = list2;
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;

        } else {
            head = list1;
        }

        while (list1.next != null) {
            if (list2 == null) {
                break;
            }
            if (list1.next.val > list2.val) {
                ListNode tail1 = list1.next;
                ListNode tail2 = list2.next;
                list1.next = list2;
                list1.next.next = tail1;

                list1 = list1.next;
                list2 = tail2;
            } else {
                list1 = list1.next;
            }
        }
        if (list2 != null) {
            list1.next = list2;
        }
        return head;
    }

}
