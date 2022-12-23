package com.exercise.project.exerciseproject.ztm.trees;

import org.springframework.stereotype.Service;

@Service
class IsValidBSTService {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        return isValidBST(root, Double.NEGATIVE_INFINITY, Double.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, double lesser, double greater) {
        if (node.val <= lesser || node.val >= greater) {
            return false;
        }

        if (node.left != null) {
            if (!isValidBST(node.left, lesser, node.val)) {
                return false;
            }
        }

        if (node.right != null) {
            if (!isValidBST(node.right, node.val, greater)) {
                return false;
            }
        }

        return true;
    }
}