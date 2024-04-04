import java.util.HashSet;
import java.util.UUID;

public class duplicate {

    //remove duplicate values from String
    public static void main(String[]args){
        String input = "alpha beta gamma delta alpha beta gamma delta";
        String[] splittedString = input.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String s : splittedString){
            uniqueWords.add(s);
        }
        for (String unique : uniqueWords){
            System.out.println(unique);
        }
    }
}
