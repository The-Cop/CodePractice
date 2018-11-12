package ru.thecop.cdpr.ctci.ch1arraysandstrings;

public class Ch1Q3Urlify {

//    URLify: Write a method to replace all spaces in a string with %20 You may assume that the string
//    has sufficient space at the end to hold the additional characters, and that you are given the "true"
//    length of the string. (Note: If implementing in Java, please use a character array so that you can
//    perform this operation in place.)
//    EXAMPLE
//    Input: "Mr John Smith    "
//    Output: "Mr%20John%20Smith"

    public static char[] urlify(char[] s, int trueLength) {
        int spacesCount = 0;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                spacesCount++;
            }
        }
        final int additionalCharsForReplacement = 2;
        int shift = spacesCount * additionalCharsForReplacement;//need 2 chars more to replace ' ' with '%20'

        for (int i = trueLength - 1; i >= 0 && shift > 0; i--) {
            if (s[i] != ' ') {
                s[i + shift] = s[i];
            } else {
                s[i + shift - 2] = '%';
                s[i + shift - 1] = '2';
                s[i + shift] = '0';
                shift -= additionalCharsForReplacement;//
            }
        }
        return s;
    }

}
