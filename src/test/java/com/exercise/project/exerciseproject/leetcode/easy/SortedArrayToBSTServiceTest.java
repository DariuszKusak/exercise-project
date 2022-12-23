package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.tree.SortedArrayToBSTService;
import com.exercise.project.exerciseproject.leetcode.easy.tree.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SortedArrayToBSTServiceTest {

    @Autowired
    SortedArrayToBSTService service;

    @Test
    void sortedArrayToBST() {
        TreeNode treeNode = service.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }
}