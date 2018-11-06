package ru.thecop.cdpr.ctci.ch1arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ch1Q2CheckPermutation {
//    Given two strings, write a method to decide if one is a permutation of the
//    other.

    public static boolean checkPermutationArraySort(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static boolean checkPermutationMap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.computeIfAbsent(c, count -> 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map.put(c, map.computeIfAbsent(c, count -> 0) - 1);
        }
        return map.values().stream().noneMatch(count -> count != 0);
    }

}
