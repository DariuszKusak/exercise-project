package com.exercise.project.exerciseproject.ztm.recursion;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecursionExercisesService {

    public List<Integer> traversBFS(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> storage = new LinkedList<>();
        LinkedList<Integer> results = new LinkedList<>();

        storage.add(root);

        while (!storage.isEmpty()) {
            TreeNode<Integer> poll = storage.poll();

            if (poll.getLeft() != null) {
                storage.add(poll.getLeft());
            }

            if (poll.getRight() != null) {
                storage.add(poll.getRight());
            }
           results.add(poll.getValue());
        }

        return results;
    }

    public Stack<Integer> traverseDFSInOrder(TreeNode<Integer> root) {
        return traverseDFSInOrder(root, new Stack<>());
    }

    //DFSInOrder
    private Stack<Integer> traverseDFSInOrder(TreeNode<Integer> node, Stack<Integer> storage) {
        if (node.getLeft() != null) {
            traverseDFSInOrder(node.getLeft(), storage);
        }
        storage.push(node.getValue());
        if (node.getRight() != null) {
            traverseDFSInOrder(node.getRight(), storage);
        }
        return storage;
    }

}
