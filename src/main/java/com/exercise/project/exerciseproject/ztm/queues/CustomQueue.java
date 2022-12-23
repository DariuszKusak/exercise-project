package com.exercise.project.exerciseproject.ztm.queues;

import java.util.Stack;

public class CustomQueue<T> {
    private Stack<T> internalStack = new Stack<>();

    public boolean empty() {
        return this.internalStack.empty();
    }

    public T peek() {
        if (internalStack.isEmpty()) {
            return null;
        }
        return internalStack.peek();
    }

    public void enqueue(T element) {
        Stack<T> tmp = new Stack<>();
        tmp.push(element);
        tmp.addAll(internalStack);
        internalStack.clear();
        internalStack.addAll(tmp);
    }

    public void dequeue() {
        if (!internalStack.isEmpty()) {
            internalStack.pop();
        }

    }

    public void print() {
        while (!internalStack.isEmpty()) {
            System.out.println(internalStack.pop());
        }


    }


}
