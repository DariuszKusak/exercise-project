package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class BinaryTreePreOrderTraversalService {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        return preorderTraversal(root, new LinkedList<>());
    }

    private List<Integer> preorderTraversal(TreeNode node, List<Integer> results) {
        results.add(node.val);

        if (node.left != null) {
            preorderTraversal(node.left, results);
        }

        if (node.right != null) {
            preorderTraversal(node.right, results);
        }

        return results;
    }

}
