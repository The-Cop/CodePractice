package ru.thecop.cdpr.ctci.ch1arraysandstrings;

public class Ch1Q1IsUnique {
//    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//    cannot use additional data structures?

    public static boolean allUniqueCharacters(String s) {
        long mask = 0;
        for (char c : s.toCharArray()) {
            int value = c - 'a';
            long shift = 1 << value;

            long maskWithNewChar = mask | shift;

            if (maskWithNewChar == mask) {
                return false;
            }
            mask = maskWithNewChar;
        }
        return true;
    }

}
