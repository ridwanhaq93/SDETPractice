package org.example;


import java.util.HashSet;

public class Remove {


    public static void main(String[] args) {
        String input = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        removeDuplicateWords(input);
    }


    private static void removeDuplicateWords(String words) {
        String[] s = words.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String unique : s) {
            uniqueWords.add(unique);
        }
        for (String b : uniqueWords) {


            System.out.println(b);
        }

    }
}

