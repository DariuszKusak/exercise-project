package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BinaryTreePathsServiceTest {

    @Autowired
    BinaryTreePathsService service;

    @Test
    void binaryTreePaths() {
        TreeNode l2 = new TreeNode(5, null, null);
        TreeNode l1 = new TreeNode(3, null, null);
        TreeNode n1 = new TreeNode(2, null, l2);
        TreeNode root = new TreeNode(1, n1, l1);

        service.binaryTreePaths(root);
    }
}