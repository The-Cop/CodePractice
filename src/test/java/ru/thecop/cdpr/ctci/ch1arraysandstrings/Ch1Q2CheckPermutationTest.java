package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1Q2CheckPermutationTest {

    @Test
    void testCheckPermutationArraySort() {
        assertTrue(Ch1Q2CheckPermutation.checkPermutationArraySort("abc", "cab"));
        assertTrue(Ch1Q2CheckPermutation.checkPermutationArraySort("aaaabbbb", "abababab"));
        assertFalse(Ch1Q2CheckPermutation.checkPermutationArraySort("abcd", "caba"));
        assertFalse(Ch1Q2CheckPermutation.checkPermutationArraySort("abcd", "dcb"));
    }

    @Test
    void testCheckPermutationMap() {
        assertTrue(Ch1Q2CheckPermutation.checkPermutationMap("abc", "cab"));
        assertTrue(Ch1Q2CheckPermutation.checkPermutationMap("aaaabbbb", "abababab"));
        assertFalse(Ch1Q2CheckPermutation.checkPermutationMap("abcd", "caba"));
        assertFalse(Ch1Q2CheckPermutation.checkPermutationMap("abcd", "dcb"));
    }
}
