package com.exercise.project.exerciseproject.ztm.recursion;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;
}
