package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ch1Q5OneAwayTest {

    @Test
    void isZeroOrOneAwayTest() {
        assertTrue(Ch1Q5OneAway.isZeroOrOneAway("pale", "ple"));
        assertTrue(Ch1Q5OneAway.isZeroOrOneAway("pales", "pale"));
        assertTrue(Ch1Q5OneAway.isZeroOrOneAway("pale", "bale"));
        assertFalse(Ch1Q5OneAway.isZeroOrOneAway("pale", "bake"));
    }
}
