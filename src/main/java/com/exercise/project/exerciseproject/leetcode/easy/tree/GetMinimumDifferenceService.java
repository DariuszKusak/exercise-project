package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GetMinimumDifferenceService {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = gatherValues(root, new ArrayList<>());
        Collections.sort(values);

        int minDiff = Integer.MAX_VALUE;

        if (values.size() == 2) {
            return Math.abs(values.get(1) - values.get(0));
        }

        for (int i = 0; i < values.size() - 1; i++) {
            if (Math.abs(values.get(i + 1) - values.get(i)) < minDiff) {
                minDiff = Math.abs(values.get(i + 1) - values.get(i));
            }
        }

        return minDiff;
    }

    private List<Integer> gatherValues(TreeNode node, List<Integer> values) {
        if (node != null) {
            values.add(node.val);
        }
        if (node.left != null) {
            gatherValues(node.left, values);
        }
        if (node.right != null) {
            gatherValues(node.right, values);
        }

        return values;
    }

}
