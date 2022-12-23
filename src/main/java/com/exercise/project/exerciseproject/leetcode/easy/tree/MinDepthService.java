package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthService {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

        while (!queue.isEmpty()) {
            int queueLength = queue.size();

            while (queueLength > 0) {
                TreeNode poll = queue.poll();
                if (poll.left == null && poll.right == null) {
                    return level;
                }
                queueLength--;

                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }

            }
            level++;
        }

        return level;
    }
}
