package com.exercise.project.exerciseproject.trees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class IsValidBSTServiceTest {

    @Autowired
    IsValidBSTService service;

    @Test
    void isValidBST() {
        assertFalse(service.isValidBST(TreeProvider.createTree12()));
    }

}