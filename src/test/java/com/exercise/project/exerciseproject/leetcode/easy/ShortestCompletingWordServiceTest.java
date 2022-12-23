package com.exercise.project.exerciseproject.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShortestCompletingWordServiceTest {

    @Autowired
    ShortestCompletingWordService service;

    @Test
    void shortestCompletingWord() {
        service.shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"});
    }
}