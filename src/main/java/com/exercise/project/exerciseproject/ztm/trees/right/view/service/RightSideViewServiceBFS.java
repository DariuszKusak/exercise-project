package com.exercise.project.exerciseproject.ztm.trees.right.view.service;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RightSideViewServiceBFS implements RightSideViewService {
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        if (root.left == null && root.right == null) {
            return List.of(root.val);
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {

            int length = queue.size();
            int count = 0;

            while (count < length) {
                TreeNode node = queue.poll();
                if (count == length - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count++;
            }
        }
        return result;
    }
}
