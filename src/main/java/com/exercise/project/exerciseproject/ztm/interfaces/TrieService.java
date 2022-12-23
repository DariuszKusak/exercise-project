package com.exercise.project.exerciseproject.ztm.interfaces;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class TrieService implements Trie {
    private final Node head;

    public TrieService(String word) {
        head = new Node(false);
        insert(word);
    }

    @Override
    public void insert(String word) {
        insert(head, word, 0);
    }

    private void insert(Node node, String word, int index) {
        if (index == word.length()) {
            return;
        }
        if (node.getChildren().containsKey(word.charAt(index))) {
            Node existingNode = node.getChildren().get(word.charAt(index));
            if (index == word.length() - 1) {
                existingNode.finishedWord();
            }
            insert(existingNode, word, index + 1);
        } else {
            Node tmpNode = node;
            for (int j = index; j < word.length(); j++) {
                Node nextNode = new Node(j == word.length() - 1);
                tmpNode.getChildren().put(word.charAt(j), nextNode);
                tmpNode = nextNode;
            }
        }
    }

    @Override
    public boolean search(String word) {
        return search(head, word, 0, false);
    }

    @Override
    public boolean startsWith(String prefix) {
        return search(head, prefix, 0, true);
    }

    public boolean search(Node node, String word, int index, boolean prefixSearch) {
        if (index == word.length()) {
            return prefixSearch || node.isEnd();
        } else {
            for (Map.Entry<Character, Node> child : node.getChildren().entrySet()) {
                if (node.getChildren().containsKey(word.charAt(index))) {
                    return search(child.getValue(), word, index + 1, prefixSearch);
                }
            }
        }
        return false;
    }

    @Getter
    class Node {
        Map<Character, Node> children;
        boolean end;

        public Node(boolean end) {
            this.children = new HashMap<>();
            this.end = end;
        }

        public void finishedWord() {
            this.end = true;
        }
    }

}
