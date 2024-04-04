package RahulShettyJavaCoding;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfCharactersInString {

    public static void getCharCount(String name) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        System.out.println(name + " : " + charMap);
    }

    public static void main(String[] args) {
        getCharCount("test");
    }
}
