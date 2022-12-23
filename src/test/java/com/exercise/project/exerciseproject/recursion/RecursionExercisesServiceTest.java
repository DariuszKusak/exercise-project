package com.exercise.project.exerciseproject.recursion;

import com.exercise.project.exerciseproject.ztm.recursion.RecursionExercisesService;
import com.exercise.project.exerciseproject.ztm.recursion.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursionExercisesServiceTest {

    @Autowired
    RecursionExercisesService recursionExercisesService;

    @Test
    void traversBFS() {
        TreeNode<Integer> l1 = new TreeNode<>(1, null, null);
        TreeNode<Integer> l2 = new TreeNode<>(6, null, null);
        TreeNode<Integer> l3 = new TreeNode<>(15, null, null);
        TreeNode<Integer> l4 = new TreeNode<>(170, null, null);
        TreeNode<Integer> n1 = new TreeNode<>(4, l1, l2);
        TreeNode<Integer> n2 = new TreeNode<>(20, l3, l4);
        TreeNode<Integer> root = new TreeNode<>(9, n1, n2);


        assertEquals(List.of(root.getValue(), n1.getValue(), n2.getValue(), l1.getValue(), l2.getValue(), l3.getValue(), l4.getValue()), recursionExercisesService.traversBFS(root));
    }

    @Test
    void traverseDFSInOrder() {
        TreeNode<Integer> l1 = new TreeNode<>(1, null, null);
        TreeNode<Integer> l2 = new TreeNode<>(6, null, null);
        TreeNode<Integer> l3 = new TreeNode<>(15, null, null);
        TreeNode<Integer> l4 = new TreeNode<>(170, null, null);
        TreeNode<Integer> n1 = new TreeNode<>(4, l1, l2);
        TreeNode<Integer> n2 = new TreeNode<>(20, l3, l4);
        TreeNode<Integer> root = new TreeNode<>(9, n1, n2);

        Stack<Integer> stack = new Stack<>();
        stack.add(l1.getValue());
        stack.add(n1.getValue());
        stack.add(l2.getValue());
        stack.add(root.getValue());
        stack.add(l3.getValue());
        stack.add(n2.getValue());
        stack.add(l4.getValue());

        assertEquals(stack, recursionExercisesService.traverseDFSInOrder(root));
    }
}