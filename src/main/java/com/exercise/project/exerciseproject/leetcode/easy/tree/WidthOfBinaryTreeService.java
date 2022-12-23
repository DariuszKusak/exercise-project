package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class WidthOfBinaryTreeService {
    public int widthOfBinaryTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int length = queue.size();
            int count = 0;

            while (count < length) {
                TreeNode node = queue.poll();

                System.out.println(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                } else {
                    queue.add(new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)));
                }

                if (node.right != null) {
                    queue.add(node.right);
                } else {
                    queue.add(new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)));
                }
                count++;
                if (count == length) {
                    System.out.println("###");
                }
            }


        }

        return -1;
    }
}
