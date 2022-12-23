package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IsSameTreeServiceTest {

    @Autowired
    IsSameTreeService service;

    @Test
    void isSameTree() {

        TreeNode right = new TreeNode(1, null, null);
        TreeNode left = new TreeNode(2, null, null);
        TreeNode p = new TreeNode(1, left, right);

        TreeNode rightR = new TreeNode(2, null, null);
        TreeNode leftR = new TreeNode(1, null, null);
        TreeNode r = new TreeNode(1, leftR, rightR);

        service.isSameTree(p, r);

    }
}