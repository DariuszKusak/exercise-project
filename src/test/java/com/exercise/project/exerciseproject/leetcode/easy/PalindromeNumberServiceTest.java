package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.PalindromeNumberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PalindromeNumberServiceTest {

    @Autowired
    PalindromeNumberService service;

    @Test
    void isPalindrome() {
        service.isPalindrome(121);
    }
}