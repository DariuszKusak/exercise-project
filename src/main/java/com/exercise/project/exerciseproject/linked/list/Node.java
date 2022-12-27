package com.exercise.project.exerciseproject.linked.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
