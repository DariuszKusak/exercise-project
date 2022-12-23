package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
class GetMinimumDifferenceServiceTest {

    @Autowired
    GetMinimumDifferenceService service;

    @Test
    void getMinimumDifference() {
        TreeNode l5 = new TreeNode(3);
        TreeNode l4 = new TreeNode(1);
        TreeNode l3 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, l4, l5);
        TreeNode root = new TreeNode(4, n2, l3);

        service.getMinimumDifference(root);
    }

    @Test
    void getMinimumDifferenceV2() {
        TreeNode n2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, n2);

        service.getMinimumDifference(root);
    }

}