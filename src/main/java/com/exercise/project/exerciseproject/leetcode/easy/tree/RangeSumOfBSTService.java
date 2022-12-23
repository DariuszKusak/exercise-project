package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

@Service
public class RangeSumOfBSTService {
    private static int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum(root, low, high);
        return sum;
    }

    private void sum(TreeNode root, int low, int high) {
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if (root.left != null) {
            rangeSumBST(root.left, low, high);
        }

        if (root.right != null) {
            rangeSumBST(root.right, low, high);
        }
    }

}
