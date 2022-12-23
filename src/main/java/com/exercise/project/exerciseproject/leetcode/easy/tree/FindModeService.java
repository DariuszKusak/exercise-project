package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

@Service
public class FindModeService {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> results = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();

            if (results.containsKey(poll.val)) {
                results.put(poll.val, results.get(poll.val) + 1);
            } else {
                results.put(poll.val, 1);
            }


            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }

        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        final int maxI = max;

        return results.entrySet().stream()
                .filter(e -> e.getValue() == maxI)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .toArray();

    }
}
