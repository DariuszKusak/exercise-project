package com.exercise.project.exerciseproject.ztm.trees;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class CountNodesService {
    Integer result = -1;

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null & root.right == null) {
            return 1;
        }

        System.out.println();

        int deepestLevelLeft = findDeepestLevelLeft(root, 0);
        int deepestLevelRight = findDeepestLevelRight(root, 0);

        if (deepestLevelLeft == deepestLevelRight) {
            return (int) Math.pow(2, deepestLevelLeft) - 1;
        } else {
            int sum1 = (int) Math.pow(2, deepestLevelLeft - 1) - 1;
            findBreakNode(root.left, root.right, 0);
            return sum1 + result;
        }
    }

    private void findBreakNode(TreeNode left, TreeNode right, int counter) {

        if (left != null && right == null) {
            result = counter * 2 + 1;
        }

        if (right != null) {
            findBreakNode(right.left, right.right, counter*2 + 1);
        }

        if (left != null) {
            findBreakNode(left.left, left.right, counter * 2);
        }
    }

    private int findDeepestLevelLeft(TreeNode node, int level) {
        level++;

        if (node == null) {
            return level -1;
        } else {
            return findDeepestLevelLeft(node.left, level);
        }
    }

    private int findDeepestLevelRight(TreeNode node, int level) {
        level++;

        if (node == null) {
            return level -1;
        } else {
            return findDeepestLevelRight(node.right, level);
        }
    }


    public int countNodesBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int counter = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                counter++;
                queue.add(node.left);
            }
            if (node.right != null) {
                counter++;
                queue.add(node.right);
            }
        }
        return counter;
    }

}
