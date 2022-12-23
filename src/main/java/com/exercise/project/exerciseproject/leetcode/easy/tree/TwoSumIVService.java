package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@Service
public class TwoSumIVService {
    public boolean findTarget(TreeNode root, int k) {
        if (root.left == null && root.right == null) {
            return false;
        }

        Set<Integer> storage = new HashSet<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (storage.contains(poll.val)) {
                return true;
            } else {
                storage.add(k- poll.val);
            }
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }

        return false;
    }
}
