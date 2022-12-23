package com.exercise.project.exerciseproject.ztm.list.doub;

import com.exercise.project.exerciseproject.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DetectCircleService {
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while (true) {
            if (tortoise.next == null || hare.next == null || hare.next.next == null) {
                return null;
            } else {
                tortoise = tortoise.next;
                hare = hare.next.next;
                if (tortoise.equals(hare)) {
                    hare = head;
                    tortoise = tortoise.next;
                    break;
                }
            }
        }

        while (!tortoise.equals(hare)) {
            hare = hare.next;
        }

        return hare;
    }


    public ListNode detectCycleNaive(ListNode head) {
        if (head == null) {
            return null;
        }


        Set<ListNode> visited = new HashSet<>();

        ListNode temp = head;
        visited.add(head);

        while (temp.next != null) {
            temp = temp.next;
            if (visited.contains(temp)) {
                return temp;
            }
            visited.add(temp);
        }
        return null;
    }
}
