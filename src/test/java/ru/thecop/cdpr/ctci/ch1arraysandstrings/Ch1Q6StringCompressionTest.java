package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ch1Q6StringCompressionTest {

    @Test
    void compressTest() {
        assertEquals("a2b1c5a3", Ch1Q6StringCompression.compress("aabcccccaaa"));
        assertEquals("a", Ch1Q6StringCompression.compress("a"));
        assertEquals("aa", Ch1Q6StringCompression.compress("aa"));
        assertEquals("a3", Ch1Q6StringCompression.compress("aaa"));
    }
}
