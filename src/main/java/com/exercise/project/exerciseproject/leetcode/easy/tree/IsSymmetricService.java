package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IsSymmetricService {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }


    public boolean isSymmetric2(TreeNode root) {
        return gatherLeft(root, new ArrayList<>()).equals(gatherRight(root, new ArrayList<>()));
    }

    private List<Integer> gatherLeft(TreeNode node, List<Integer> cache) {
        if (node.right == null && node.left != null) {
            cache.add(null);
        }

        if (node.left != null) {
            gatherLeft(node.left, cache);
        }
        cache.add(node.val);
        if (node.right != null) {
            gatherLeft(node.right, cache);
        }
        return cache;
    }

    private List<Integer> gatherRight(TreeNode node, List<Integer> cache) {
        if (node.left == null && node.right != null) {
            cache.add(null);
        }
        if (node.right != null) {
            gatherRight(node.right, cache);
        }
        cache.add(node.val);
        if (node.left != null) {
            gatherRight(node.left, cache);
        }
        return cache;
    }


}
