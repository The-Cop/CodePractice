package ru.thecop.cdpr.ctci.ch1arraysandstrings;

public class Ch1Q5OneAway {
//    One Away: There are three types of edits that can be performed on strings: insert a character,
//    remove a character, or replace a character. Given two strings, write a function to check if they are
//    one edit (or zero edits) away.
//    EXAMPLE
//    pale, ple -> true
//    pales, pale -> true
//    pale, bale -> true
//    pale, bake -> false

    public static boolean isZeroOrOneAway(String s1, String s2) {
        String shortest = s1.length() > s2.length() ? s2 : s1;
        String longest = s1.length() > s2.length() ? s1 : s2;

        if (longest.length() - shortest.length() > 1) {
            return false;
        }
        boolean sameLength = s1.length() == s2.length();
        boolean singleDiff = false;

        int shortIndex = 0;
        int longIndex = 0;
        while (shortIndex < shortest.length()) {

            if (shortest.charAt(shortIndex) != longest.charAt(longIndex)) {
                //already found diff and this is second
                if (singleDiff) {
                    return false;
                }
                singleDiff = true;

                if (!sameLength) {
                    longIndex++;
                }
            }
            shortIndex++;
            longIndex++;

        }
        return true;

    }
}
