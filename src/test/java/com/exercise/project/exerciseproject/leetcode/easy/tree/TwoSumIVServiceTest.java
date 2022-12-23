package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TwoSumIVServiceTest {

    @Autowired
    TwoSumIVService service;

    @Test
    void findTarget() {
        TreeNode l2 = new TreeNode(3);
        TreeNode r1 = new TreeNode(2, null, l2);

        assertTrue(service.findTarget(r1, 6));
    }

    @Test
    void findTargetV2() {
        TreeNode l2 = new TreeNode(2);
        TreeNode r1 = new TreeNode(1, null, l2);

        assertTrue(service.findTarget(r1, 2));
    }
}