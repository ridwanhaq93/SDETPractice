package RahulShettyJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers   {
//write a method to find if String is a palindrome.
//a palindrome is a letter when written backwards is the same thing
    //anna
public static void main(String[]args){
    System.out.println(isPandrome("anna"));
}

public static boolean isPandrome(String word){
String reversed="";
for (int i=word.length()-1;i>=0;i--){
    reversed= reversed+ word.charAt(i);
}
return reversed.equals(word);
}
}