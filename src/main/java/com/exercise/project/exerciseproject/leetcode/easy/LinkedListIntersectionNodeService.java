package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class LinkedListIntersectionNodeService {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> listAStorage = new HashSet<>();

        while (headA != null) {
            listAStorage.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (listAStorage.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

}
