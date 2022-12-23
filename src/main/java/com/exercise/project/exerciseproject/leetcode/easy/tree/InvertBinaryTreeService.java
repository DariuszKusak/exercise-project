package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

@Service
public class InvertBinaryTreeService {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTreeRecursive(root);
        return root;
    }

    private void invertTreeRecursive(TreeNode root) {
        if (root.left != null || root.right != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if (root.left != null) {
                invertTreeRecursive(root.left);
            }
            if (root.right != null) {
                invertTreeRecursive(root.right);
            }
        }
    }

}
