package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1Q1IsUniqueTest {

    @Test
    void testAllUniqueCharacters() {
        assertTrue(Ch1Q1IsUnique.allUniqueCharacters("abc"));
        assertTrue(Ch1Q1IsUnique.allUniqueCharacters("a"));
        assertFalse(Ch1Q1IsUnique.allUniqueCharacters("abcdefghai"));
        assertFalse(Ch1Q1IsUnique.allUniqueCharacters("aa"));
    }
}
