package com.exercise.project.exerciseproject.ztm.list.doub;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class FlattenDoubleLinkedListService {
    public Node flatten(Node head) {
        Node flatten = flatten(head, new Stack<>());

        return flatten;
    }

    private Node flatten(Node node, Stack<Node> stack) {
        if (node.child != null) {
            stack.push(node.next);
            Node child = node.child;
            child.prev = node;
            node.next = child;
        }
        if (node.next != null) {
            flatten(node.next, stack);
        }
        while (!stack.isEmpty()) {
            addLast(node, stack.pop());
        }
        return node;
    }

    private void addLast(Node node, Node add) {
        if (node.next == null) {
            node.next = add;
            add.prev = node;
        } else {
            Node tmp = node.next;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            add.prev = tmp;
            tmp.next = add;
        }
    }

}
