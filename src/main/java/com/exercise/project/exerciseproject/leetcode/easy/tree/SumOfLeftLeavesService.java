package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.springframework.stereotype.Service;

@Service
public class SumOfLeftLeavesService {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
        if (isLeft && node.left == null && node.right == null) {
            sum = sum + node.val;
        }

        if (node.left != null) {
             sumOfLeftLeaves(node.left, true);
        }
        if (node.right != null) {
             sumOfLeftLeaves(node.right, false);
        }

        return sum;
    }


}
