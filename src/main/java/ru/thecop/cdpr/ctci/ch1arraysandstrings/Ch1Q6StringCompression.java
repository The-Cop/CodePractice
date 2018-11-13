package ru.thecop.cdpr.ctci.ch1arraysandstrings;

public class Ch1Q6StringCompression {

//    String Compression: Implement a method to perform basic string compression using the counts
//    of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
//"compressed" string would not become smaller than the original string, your method should return
//    the original string. You can assume the string has only uppercase and lowercase letters (a - z).


    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
            if (i == s.length() - 1) {
                sb.append(currentChar).append(count);
            }
        }
        String result = sb.toString();
        return result.length() >= s.length() ? s : result;
    }
}
