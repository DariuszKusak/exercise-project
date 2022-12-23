package com.exercise.project.exerciseproject.ztm.trees.right.view.service;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RightSideViewServiceDFS implements RightSideViewService {
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        if (root.left == null && root.right == null) {
            return List.of(root.val);
        }
        return findMaximumDepthPath(root, 1, new ArrayList<>());
    }

    private List<Integer> findMaximumDepthPath(TreeNode node, int level, List<Integer> result) {
        if (node == null) {
            return result;
        }
        if(result.size() < level) {
            result.add(node.val);
        }
        level++;

        if (node.right != null) {
             findMaximumDepthPath(node.right, level, result);
        }

        if (node.left != null) {
             findMaximumDepthPath(node.left, level, result);
        }
        return result;
    }
}
