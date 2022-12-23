package com.exercise.project.exerciseproject.trees;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import org.springframework.stereotype.Service;

@Service
public class TreeProvider {
    public static TreeNode createTree1() {
        TreeNode n1 = new TreeNode(2, null, null);
        return new TreeNode(1, n1, null);
    }

    public static TreeNode createTree2() {
        TreeNode l2 = new TreeNode(4, null, null);
        TreeNode n2 = new TreeNode(3, null, l2);
        TreeNode l1 = new TreeNode(5, null, null);
        TreeNode n1 = new TreeNode(2, null, n2);
        return new TreeNode(1, n1, l1);
    }

    public static TreeNode createTree3() {
        TreeNode l1 = new TreeNode(4, null, null);
        TreeNode l2 = new TreeNode(5, null, null);
        TreeNode l3 = new TreeNode(6, null, null);
        TreeNode n2 = new TreeNode(3, null, l3);
        TreeNode n1 = new TreeNode(2, l1, l2);
        return new TreeNode(1, n1, n2);
    }

    public static TreeNode createTree4() {
        TreeNode l11 = new TreeNode(11, null, null);
        TreeNode l10 = new TreeNode(10, null, null);
        TreeNode l9 = new TreeNode(9, null, null);
        TreeNode l8 = new TreeNode(8, null, null);
        TreeNode l7 = new TreeNode(7, null, null);
        TreeNode l6 = new TreeNode(6, null, null);
        TreeNode n5 = new TreeNode(5, l11, null);
        TreeNode n4 = new TreeNode(4, l9, l10);
        TreeNode n3 = new TreeNode(3, l7, l8);
        TreeNode n2 = new TreeNode(2, n5, l6);
        TreeNode n1 = new TreeNode(1, n3, n4);
        return new TreeNode(0, n1, n2);
    }

    public static TreeNode createTree5() {
        TreeNode l4 = new TreeNode(6, null, null);
        TreeNode l3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(4, l3, l4);
        TreeNode l1 = new TreeNode(1, null, null);
        return new TreeNode(5, l1, n2);
    }

    public static TreeNode createTree6() {
        TreeNode l2 = new TreeNode(7, null, null);
        TreeNode l1 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(6, l1, l2);
        TreeNode n1 = new TreeNode(4, null, null);
        return new TreeNode(5, n1, n2);
    }

    public static TreeNode createTree7() {
        TreeNode n22 = new TreeNode(3, null, null);
        TreeNode n21 = new TreeNode(1, null, null);
        return new TreeNode(2, n21, n22);
    }

    public static TreeNode createTree8() {
        TreeNode l2 = new TreeNode(2, null, null);
        TreeNode l1 = new TreeNode(2, null, null);
        return new TreeNode(2, l1, l2);
    }

    public static TreeNode createTree9() {
        TreeNode l7 = new TreeNode(200, null, null);
        TreeNode l6 = new TreeNode(150, null, null);
        TreeNode l5 = new TreeNode(135, null, null);
        TreeNode l4 = new TreeNode(119, null, null);
        TreeNode n3 = new TreeNode(160, l6, l7);
        TreeNode n2 = new TreeNode(130, l4, l5);
        TreeNode n1 = new TreeNode(140, n2, n3);
        return new TreeNode(120, null, n1);
    }

    public static TreeNode createTree10() {
        TreeNode l6 = new TreeNode(6, null, null);
        TreeNode l5 = new TreeNode(4, null, null);
        TreeNode l4 = new TreeNode(2, null, null);
        TreeNode l3 = new TreeNode(0, null, null);
        TreeNode n2 = new TreeNode(5, l5, l6);
        TreeNode n1 = new TreeNode(1, l3, l4);
        return new TreeNode(3, n1, n2);
    }

    public static TreeNode createTree11() {
        TreeNode l4 = new TreeNode(7, null, null);
        TreeNode l3 = new TreeNode(3, null, null);
        TreeNode n2 = new TreeNode(6, l3, l4);
        TreeNode n1 = new TreeNode(4, null, null);
        return new TreeNode(5, n1, n2);
    }

    public static TreeNode createTree12() {
        TreeNode l7 = new TreeNode(3, null, null);
        TreeNode l6 = new TreeNode(4, null, null);
        TreeNode l5 = new TreeNode(2, null, null);
        TreeNode l4 = new TreeNode(0, null, null);
        TreeNode n3 = new TreeNode(6, null, l7);
        TreeNode n2 = new TreeNode(5, l6, n3);
        TreeNode n1 = new TreeNode(1, l4, l5);
        return new TreeNode(3, n1, n2);
    }

    public static TreeNode createTree13() {
        TreeNode l5 = new TreeNode(27, null, null);
        TreeNode l4 = new TreeNode(56, null, null);
        TreeNode n3 = new TreeNode(19, null, l5);
        TreeNode n2 = new TreeNode(47, null, l4);
        TreeNode n1 = new TreeNode(26, n3, null);
        return new TreeNode(32, n1, n2);
    }

}
