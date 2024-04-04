import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
public static void main(String[]args){
    FindDuplicate("aabble");
}

//user generic function to select dropdrown

    public static void SelectOptionFromDroption(WebElement element, String value){
        Select select =new Select(element);
        List<WebElement> options=select.getOptions();
        for (WebElement option : options){
            if (option.getText().equals(value)){
                option.click();
                break;
            }
        }
    }
    //print duplicate characters in a string
    //input=aable
    public static void FindDuplicate(String word){
        Set<Character> Duplicates= new HashSet<>();
        for (int i=0;i<word.length();i++){
            for (int j=i+1;j<word.length();j++){
                if (word.charAt(i)==word.charAt(j)){
                    Duplicates.add(word.charAt(i));
                }
            }
        }
        System.out.println(Duplicates.toString());
    }
}