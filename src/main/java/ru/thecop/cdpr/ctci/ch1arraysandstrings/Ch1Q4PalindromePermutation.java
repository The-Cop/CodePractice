package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class Ch1Q4PalindromePermutation {


//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
//    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
//    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
//    EXAMPLE
//    Input: Tact Coa
//    Output: True (permutations: "taco cat", "atco cta", etc.)

    public static boolean canBeAPalindromeUsingMap(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        char[] chars = s.toCharArray();
        int lengthWithoutSpaces = 0;
        for (char c : chars) {
            if (c != ' ') {
                lengthWithoutSpaces++;
                charCounts.compute(c, (k, v) -> v == null ? 1 : v + 1);
            }
        }
        boolean isLengthEven = lengthWithoutSpaces % 2 == 0;
        boolean hasUnevenCountOfChar = false;
        for (Integer charCount : charCounts.values()) {
            if (charCount % 2 == 0) {
                continue;
            } else {
                if (isLengthEven) {
                    return false;
                } else {
                    if (!hasUnevenCountOfChar) {
                        hasUnevenCountOfChar = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean canBeAPalindromeUsingBitVector(String s) {
        long bitVector = 0;
        char[] chars = s.toCharArray();
        int lengthWithoutSpaces = 0;
        for (char c : chars) {
            if (c != ' ') {
                lengthWithoutSpaces++;
                int charValueForShifting = c - 'a';
                long valueForAnd = 1 << charValueForShifting;
                bitVector ^= valueForAnd;
            }
        }

        boolean isLengthEven = lengthWithoutSpaces % 2 == 0;

        if (bitVector == 0 //all chars have even count
                || !isLengthEven && (bitVector & (bitVector - 1)) == 0 //length is odd and one char has odd count
        ) {
            return true;
        }
        return false;
    }

}
