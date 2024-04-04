package RahulShettyJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[]args){
        String input= "hello";

        Set<Character> newSet= new HashSet<>();
        for (int i=0;i<input.length();i++){
            if (!newSet.contains(input.charAt(i))){
            newSet.add(input.charAt(i));

        }
            }
        System.out.println(newSet);
    }
}
