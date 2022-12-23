package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PreorderService {

    public List<Integer> preorder(Node root) {
        return root != null
                ? traverse(root, new ArrayList<>())
                : Collections.emptyList();
    }

    private List<Integer> traverse(Node node, List<Integer> road) {
        road.add(node.val);
        if (node.children != null) {
            node.children.forEach(child -> traverse(child, road));
        }

        return road;
    }

}
