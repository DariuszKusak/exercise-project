package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BinaryTreePathsService {

    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePaths2(root, new ArrayList<>(), new ArrayList<>()).stream()
                .map(integers -> integers.stream().map(String::valueOf).collect(Collectors.joining("->")))
                .collect(Collectors.toList());
    }

    private List<List<Integer>> binaryTreePaths2(TreeNode node, List<List<Integer>> results, List<Integer> result) {
        result.add(node.val);
        if (node.left == null && node.right == null) {
            results.add(new ArrayList<>(result));
        } else {
            if (node.left != null) {
                binaryTreePaths2(node.left, results, new ArrayList<>(result));
            }
            if (node.right != null) {
                binaryTreePaths2(node.right, results, new ArrayList<>(result));
            }
        }
        return results;
    }

}
