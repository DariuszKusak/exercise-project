package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RangeSumOfBSTServiceTest {

    @Autowired
    RangeSumOfBSTService service;

    @Test
    void rangeSumBST() {
        TreeNode l6 = new TreeNode(18);
        TreeNode l5 = new TreeNode(7);
        TreeNode l4 = new TreeNode(3);
        TreeNode n3 = new TreeNode(15, null, l6);
        TreeNode n2 = new TreeNode(5, l4, l5);
        TreeNode n1 = new TreeNode(10, n2, n3);

        assertEquals(32, service.rangeSumBST(n1, 7, 15));
    }

    @Test
    void rangeSumBSTv2() {
        TreeNode n9 = new TreeNode(6);
        TreeNode n8 = new TreeNode(1);
        TreeNode n7 = new TreeNode(18);
        TreeNode n6 = new TreeNode(13);
        TreeNode n5 = new TreeNode(7, n9, null);
        TreeNode n4 = new TreeNode(3, n8, null);
        TreeNode n3 = new TreeNode(15, n6, n7);
        TreeNode n2 = new TreeNode(5, n4, n5);
        TreeNode n1 = new TreeNode(10, n2, n3);

        assertEquals(23, service.rangeSumBST(n1, 6, 10));
    }

}