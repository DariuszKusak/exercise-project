package com.exercise.project.exerciseproject.trees;

import com.exercise.project.exerciseproject.ztm.trees.LevelOrderOfBinaryTree;
import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LevelOrderOfBinaryTreeTest {

    @Autowired
    LevelOrderOfBinaryTree levelOrderOfBinaryTree;

    @Test
    void levelOrder() {
        TreeNode l2 = new TreeNode(7, null, null);
        TreeNode l1 = new TreeNode(15, null, null);
        TreeNode n2 = new TreeNode(20, l1, l2);
        TreeNode n1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, n1, n2);

        levelOrderOfBinaryTree.levelOrder(root);

    }

    @Test
    void levelOrder2() {

        TreeNode l1 = new TreeNode(5, null, null);
        TreeNode n3 = new TreeNode(4, l1, null);
        TreeNode n2 = new TreeNode(3, n3, null);
        TreeNode n1 = new TreeNode(2, n2, null);
        TreeNode root = new TreeNode(1, n1, null);

        System.out.println(levelOrderOfBinaryTree.levelOrder(root));

    }

}