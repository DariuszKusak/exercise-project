package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class InorderTraversalService {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        return inorderTraversal(root, new LinkedList<>());
    }

    private List<Integer> inorderTraversal(TreeNode node, List<Integer> storage) {
        if (node.left != null) {
            inorderTraversal(node.left, storage);
        }
        storage.add(node.val);
        if (node.right != null) {
            inorderTraversal(node.right, storage);
        }
        return storage;
    }

}
