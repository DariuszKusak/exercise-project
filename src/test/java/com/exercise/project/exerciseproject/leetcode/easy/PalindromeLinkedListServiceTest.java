package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.model.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PalindromeLinkedListServiceTest {

    @Autowired
    PalindromeLinkedListService service;

    @ParameterizedTest
    @MethodSource("isPalindromeProvider")
    void isPalindrome(ListNode head, boolean result) {
       assertEquals(result, service.isPalindrome(head));
    }

    private static Stream<Arguments> isPalindromeProvider() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, null))), false)
//                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null)))), true)
        );
    }

}