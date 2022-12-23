package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@Service
public class CalPointsService {
    public int calPoints(String[] operations) {
        Stack<Integer> queue = new Stack<>();

        Arrays.stream(operations).forEach(
                operation -> {
                    switch (operation) {
                        case "C" -> queue.pop();
                        case "D" -> queue.push(2*queue.peek());
                        case "+" -> {
                            Integer poll = queue.pop();
                            int tail = queue.peek() + poll;
                            queue.push(poll);
                            queue.push(tail);
                        }
                        default -> queue.add(Integer.parseInt(operation));
                    }
                }
        );

        return queue.stream().mapToInt(i->i).sum();
    }
}
