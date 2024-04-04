package org.example;

import java.util.ArrayList;

public class lengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
    }

    public static void lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        s.trim();

        ArrayList<String> a = new ArrayList<>();
        for (String b : split) {
            a.add(b);
        }
        for (int i = 0; i < a.size(); i++) {
            int lastwordLength = a.get(i).length();

            System.out.println(lastwordLength);
        }
    }
}

