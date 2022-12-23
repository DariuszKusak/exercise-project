package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class BinaryTreePostorderTraversalService {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        return postorderTraversal(root, new LinkedList<>());
    }

    private List<Integer> postorderTraversal(TreeNode node, List<Integer> results) {
        if (node.left != null) {
            postorderTraversal(node.left, results);
        }

        if (node.right != null) {
            postorderTraversal(node.right, results);
        }
        results.add(node.val);

        return results;
    }
}
