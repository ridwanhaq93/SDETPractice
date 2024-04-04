package org.example;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("jkhgjhfg"));
    }


    public static boolean isPalindrome(String word) {
        String empty = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            empty = empty + word.charAt(i);

        }

        return empty.equals(word);

    }
}
