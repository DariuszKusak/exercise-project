package com.exercise.project.exerciseproject.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> internal = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {
        internal.add(x);
    }

    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        if (internal.isEmpty()) {
            return -1;
        }

        while (internal.size() != 1) {
            temp.add(internal.poll());
        }

        int result = internal.poll();
        internal = temp;
        return result;
    }

    public int top() {
        Queue<Integer> temp = new LinkedList<>();
        if (internal.isEmpty()) {
            return -1;
        }

        while (internal.size() != 1) {
            temp.add(internal.poll());
        }

        int result = internal.poll();
        temp.add(result);
        internal = temp;
        return result;
    }

    public boolean empty() {
        return this.internal.isEmpty();
    }
}
