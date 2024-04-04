package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
An anagram is when all the letters
 in one string exist in another but
 the order of letters does not matter.
 Write a method that accepts two string arguments
 and returns true if they are anagram and false if they are not.
*/
public class TwoStringAnagram {
    public static void main(String[]args){
        System.out.println(isAnagram("listen","silent"));
    }

    public static boolean isAnagram(String string1,String string2){
    //convert both the string to char[]
    char[] charString1= string1.toCharArray();
    char[] charString2= string2.toCharArray();

    //sort the two arrays
        Arrays.sort(charString1);
        Arrays.sort(charString2);
        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return Arrays.equals(charString1,charString2);
        }
}