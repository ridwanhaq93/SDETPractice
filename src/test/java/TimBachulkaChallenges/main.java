package TimBachulkaChallenges;

import java.util.HashMap;
import java.util.Map;

public class main {
//print character occurances in a a string
public static void main(String[]args){
String word= "hello";
Map<Character,Integer> cmap= new HashMap<>();
for (int i=0;i<word.length();i++){
    char c= word.charAt(i);
    if (cmap.containsKey(c)){
        cmap.put(c,cmap.get(c)+1);
    } else {
        cmap.put(c,1);
    }
}
System.out.println(cmap.toString());
}
}