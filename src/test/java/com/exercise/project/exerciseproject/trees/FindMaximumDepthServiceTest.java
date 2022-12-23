package com.exercise.project.exerciseproject.trees;

import com.exercise.project.exerciseproject.ztm.trees.FindMaximumDepthService;
import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindMaximumDepthServiceTest {

    @Autowired
    private FindMaximumDepthService service;

    @Test
    void maxDepth() {

        TreeNode l2 = new TreeNode(7, null, null);
        TreeNode l1 = new TreeNode(15, null, null);
        TreeNode n2 = new TreeNode(20, l1, l2);
        TreeNode n1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, n1, n2);

        assertEquals(3, service.maxDepth(root));
    }
}