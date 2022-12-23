package com.exercise.project.exerciseproject.interfaces;

import com.exercise.project.exerciseproject.ztm.interfaces.TrieService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrieServiceTest {

    @Test
    void search() {
        TrieService service = new TrieService("apple");
        service.insert("app");

        assertTrue(service.search("apple"));
        assertTrue(service.search("app"));
        assertFalse(service.search("appl"));
        assertFalse(service.search("a"));
        assertFalse(service.search("le"));
        assertFalse(service.search("ppl"));

        assertTrue(service.startsWith("apple"));
        assertTrue(service.startsWith("app"));
        assertTrue(service.startsWith("appl"));
        assertTrue(service.startsWith("a"));
        assertFalse(service.startsWith("le"));
        assertFalse(service.startsWith("ppl"));
    }
}