package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IsBalancedServiceTest {

    @Autowired
    IsBalancedService service;

    @Test
    void isBalanced() {

        TreeNode l4 = new TreeNode(4, null, null);
        TreeNode l3 = new TreeNode(4, null, null);
        TreeNode l2 = new TreeNode(3, null, null);
        TreeNode l1 = new TreeNode(2, null, null);
        TreeNode n2 = new TreeNode(3, l3, l4);
        TreeNode n1 = new TreeNode(2, n2, l2);
        TreeNode root = new TreeNode(1, n1, l1);


        service.isBalanced(root);
    }
}