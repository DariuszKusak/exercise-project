package com.exercise.project.exerciseproject.leetcode.easy.tree;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumOfLeftLeavesServiceTest {

    @Autowired
    SumOfLeftLeavesService service;

    @Test
    void sumOfLeftLeaves() {
        TreeNode l3 = new TreeNode(7, null, null);
        TreeNode l2 = new TreeNode(15, null, null);
        TreeNode right = new TreeNode(20, l2, l3);
        TreeNode l1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, l1, right);

        service.sumOfLeftLeaves(root);
    }
}