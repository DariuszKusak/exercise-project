package com.exercise.project.exerciseproject.leetcode.easy.tree;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PostorderService {
    public List<Integer> postorder(Node root) {
        return root == null
                ? Collections.emptyList()
                : traverse(root, new ArrayList<>());
    }

    private List<Integer> traverse(Node node, ArrayList<Integer> road) {
        if (node.children != null && !node.children.isEmpty()) {
            node.children.forEach(child -> traverse(child, road));
        }

        road.add(node.val);

        return road;
    }
}
