package CodeForGeeks;

import java.util.Arrays;

//Java String Program to Check Anagram
//Input: str1 = "Silent"
//            str2 ="Listen"
//Output: Strings are Anagram
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();

        Arrays.sort(str1Char);
        Arrays.sort(str2Char);

        if (Arrays.equals(str1Char, str2Char)) {
            System.out.println("Anagram");
        }
    }
}

