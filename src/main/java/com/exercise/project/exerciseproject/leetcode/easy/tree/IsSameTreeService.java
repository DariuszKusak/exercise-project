package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class IsSameTreeService {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();
        pQueue.add(p);
        qQueue.add(q);

        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode pElement = pQueue.poll();
            TreeNode qElement = qQueue.poll();

            if (pElement.val != qElement.val) {
                return false;
            }

            if (pElement.left == null && qElement.left != null) {
                return false;
            }

            if (pElement.right == null && qElement.right != null) {
                return false;
            }


            if (pElement.left != null) {
                pQueue.add(pElement.left);
            }
            if (pElement.right != null) {
                pQueue.add(pElement.right);
            }

            if (qElement.left != null) {
                qQueue.add(qElement.left);
            }
            if (qElement.right != null) {
                qQueue.add(qElement.right);
            }
            if (pQueue.isEmpty() && !qQueue.isEmpty() || !pQueue.isEmpty() && qQueue.isEmpty()) {
                return false;
            }

        }

        return true;
    }


}
