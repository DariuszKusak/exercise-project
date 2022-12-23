package com.exercise.project.exerciseproject.leetcode.easy.palindrome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LongestPalindromeServiceTest {

    @Autowired
    LongestPalindromeService service;

    @Test
    void longestPalindrome() {
        service.longestPalindrome("darekk");
    }
}