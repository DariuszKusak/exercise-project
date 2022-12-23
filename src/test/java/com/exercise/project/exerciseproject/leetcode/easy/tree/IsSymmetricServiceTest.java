package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IsSymmetricServiceTest {

    @Autowired
    IsSymmetricService service;

    @Test
    void isSymmetric() {

        TreeNode t5 = new TreeNode(2, null, null);
        TreeNode t4 = new TreeNode(2, null, t5);
        TreeNode t3 = new TreeNode(2, null, null);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, t2, t4);


        service.isSymmetric(t1);
    }
}