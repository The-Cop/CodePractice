package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1Q4PalindromePermutationTest {

    @Test
    void canBeAPalindromeUsingMapTest() {
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingMap("tact coa"));
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingMap("a abbcc"));
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingMap("aa bb ccc "));
        assertFalse(Ch1Q4PalindromePermutation.canBeAPalindromeUsingMap("aaabb ccd"));
    }

    @Test
    void canBeAPalindromeUsingBitVectorTest() {
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingBitVector("tact coa"));
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingBitVector("a abbcc"));
        assertTrue(Ch1Q4PalindromePermutation.canBeAPalindromeUsingBitVector("aa bb ccc "));
        assertFalse(Ch1Q4PalindromePermutation.canBeAPalindromeUsingBitVector("aaabb ccd"));
    }
}
