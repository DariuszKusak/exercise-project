package com.exercise.project.exerciseproject.ztm.trees;

import org.springframework.stereotype.Service;

@Service
public class FindMaximumDepthService {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 0);
    }

    private int findMaxDepth(TreeNode node, int level) {
        if (node == null) {
            return level;
        } else {
            level++;
            return Math.max(findMaxDepth(node.left, level), findMaxDepth(node.right, level));
        }
    }


}
