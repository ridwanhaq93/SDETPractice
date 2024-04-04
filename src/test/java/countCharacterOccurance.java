import java.util.HashMap;
import java.util.Map;

//write a method that takes a string as a parameter and count the number of times a letter has occured in that string
public class countCharacterOccurance {
    public static void main(String[]args){
        getCharacterOccuranceInString("test");
    }

    //test

public static void getCharacterOccuranceInString(String word){
    Map<Character,Integer> cmap= new HashMap<>();
    for (int i=0;i<word.length();i++){
       char c = word.charAt(i);
            if (cmap.containsKey(c)){
                cmap.put(c,cmap.get(c)+1);
        }else {
                cmap.put(c,1);
            }
    }
    System.out.println(cmap);
    }
}