import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateWords {

/*    Task #1:
    Remove duplicate words
    Your task is to remove all duplicate words from a string, leaving only single (first) words entries.
    Example:
    Input:
            "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
    Output:
            "alpha beta gamma delta*/

    public static void main(String[]args){
        HashSet<String> uniqueWords = new HashSet<>();
        String input= "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String []split= input.split(" ");
        for (String s : split){
            uniqueWords.add(s);

        }
        for (String uniqueWord : uniqueWords){
            System.out.println(uniqueWord);
        }
    }

}
