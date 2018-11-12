package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1Q3UrlifyTest {
    @Test
    void testCheckPermutationArraySort() {
        assertTrue(Arrays.equals("Mr%20John%20Smith".toCharArray(),
                Ch1Q3Urlify.urlify("Mr John Smith    ".toCharArray(), 13)));
    }
}
