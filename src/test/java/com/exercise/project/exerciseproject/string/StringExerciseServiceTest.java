package com.exercise.project.exerciseproject.string;

import com.exercise.project.exerciseproject.ztm.string.StringExerciseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringExerciseServiceTest {

    @Autowired
    private StringExerciseService stringExerciseService;

    @Test
    void backspaceCompareBruteForce() {
        assertTrue(stringExerciseService.backspaceCompareBruteForce("ab#c", "ad#c"));
        assertTrue(stringExerciseService.backspaceCompareBruteForce("y#fo##f", "y#f#o##f"));
    }

    @Test
    void backspaceCompare() {
//        assertTrue(stringExerciseService.backspaceCompare("ab#c", "ad#c"));
//        assertTrue(stringExerciseService.backspaceCompare("y#fo##f", "y#f#o##f"));
//        assertFalse(stringExerciseService.backspaceCompare("bxj##tw", "bxj###tw"));
//        assertTrue(stringExerciseService.backspaceCompare("ab##", "c#d#"));
//        assertFalse(stringExerciseService.backspaceCompare("a#c", "b"));
        assertTrue(stringExerciseService.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    void lengthOfLongestSubstringBruteForce() {
        assertEquals(3, stringExerciseService.lengthOfLongestSubstringBruteForce("abcabcbb"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstringBruteForce("bbbb"));
        assertEquals(3, stringExerciseService.lengthOfLongestSubstringBruteForce("pwwkew"));
        assertEquals(2, stringExerciseService.lengthOfLongestSubstringBruteForce("aab"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstringBruteForce(" "));
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, stringExerciseService.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstring("bbbb"));
        assertEquals(3, stringExerciseService.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, stringExerciseService.lengthOfLongestSubstring("aab"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstring(" "));
        assertEquals(3, stringExerciseService.lengthOfLongestSubstring("dvdf"));
        assertEquals(2, stringExerciseService.lengthOfLongestSubstring("au"));
    }

    @Test
    void lengthOfLongestSubstringVer2() {
        assertEquals(3, stringExerciseService.lengthOfLongestSubstringVer2("abcabcbb"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstringVer2("bbbb"));
        assertEquals(3, stringExerciseService.lengthOfLongestSubstringVer2("pwwkew"));
        assertEquals(2, stringExerciseService.lengthOfLongestSubstringVer2("aab"));
        assertEquals(1, stringExerciseService.lengthOfLongestSubstringVer2(" "));
        assertEquals(3, stringExerciseService.lengthOfLongestSubstringVer2("dvdf"));
        assertEquals(2, stringExerciseService.lengthOfLongestSubstringVer2("au"));
    }

    @Test
    void isPalindromeBruteForce() {
        assertTrue(stringExerciseService.isPalindromeBruteForce("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome() {
//        assertTrue(stringExerciseService.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(stringExerciseService.isPalindrome("race a car"));
    }


}