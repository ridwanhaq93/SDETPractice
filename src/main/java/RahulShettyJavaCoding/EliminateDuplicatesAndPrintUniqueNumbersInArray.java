package RahulShettyJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicatesAndPrintUniqueNumbersInArray {
    public static void main(String[]args){
        int []arr = {3,3,3,3,3,4,5};
        Set<Integer> uniqueArrayNumbers = new HashSet<>();
        for (Integer s : arr){
            uniqueArrayNumbers.add(s);
        }
        for (Integer unique: uniqueArrayNumbers){
            System.out.println(unique);
        }
    }
}
