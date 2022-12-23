package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

@Service
public class HasPathSumService {

    private boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        hasPathSum(root, targetSum, 0);
        return result;
    }

    private void hasPathSum(TreeNode node, int targetSum, int sum) {
        if (node != null) {
            sum += node.val;

            if (sum == targetSum && node.left == null && node.right == null) {
                result = true;
            }

            if (node.left != null) {
                hasPathSum(node.left, targetSum, sum);
            }
            if (node.right != null) {
                hasPathSum(node.right, targetSum, sum);
            }

        }
    }


}
