package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class FindWordsServiceTest {

    @Autowired
    FindWordsService service;

    @Test
    void findWords() {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] result = new String[]{"Alaska", "Dad"};

        assertArrayEquals(result, service.findWords(words));
    }
}