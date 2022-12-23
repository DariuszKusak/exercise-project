package com.exercise.project.exerciseproject.ztm.interfaces;

public interface Trie {
    void insert(String word);
    boolean search(String word);
    boolean startsWith(String prefix);
}
