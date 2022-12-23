package com.exercise.project.exerciseproject.trees;

import com.exercise.project.exerciseproject.ztm.trees.CountNodesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountNodesServiceTest {

    @Autowired
    CountNodesService service;

    @Test
    void countNodes() {
        assertEquals(12, service.countNodes(TreeProvider.createTree4()));
    }

}