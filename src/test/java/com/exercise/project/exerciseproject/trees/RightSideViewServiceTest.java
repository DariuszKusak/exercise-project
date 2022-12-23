package com.exercise.project.exerciseproject.trees;

import com.exercise.project.exerciseproject.ztm.trees.TreeNode;
import com.exercise.project.exerciseproject.ztm.trees.right.view.service.RightSideViewService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class RightSideViewServiceTest {

    @Autowired
    List<RightSideViewService> services;

    @ParameterizedTest
    @ArgumentsSource(RightSideViewProvider.class)
    void rightSideView(List<Integer> result, TreeNode treeNode) {
        services.forEach(service -> assertEquals(result, service.rightSideView(treeNode)));
    }

}