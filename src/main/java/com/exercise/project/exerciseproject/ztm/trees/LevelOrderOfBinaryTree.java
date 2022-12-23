package com.exercise.project.exerciseproject.ztm.trees;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class LevelOrderOfBinaryTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        if (root.left == null && root.right == null) {
            return List.of(List.of(root.val));
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> results = new ArrayList<>();

        while (!queue.isEmpty()) {
            int length = queue.size();
            int count = 0;

            results.add(new ArrayList<>());
            while (count < length) {
                TreeNode currentNode = queue.poll();
                results.get(results.size()-1).add(currentNode.val);
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                count++;
            }
        }

        return results;
    }


}
