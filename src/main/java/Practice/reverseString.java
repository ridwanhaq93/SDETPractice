package Practice;


//write a java method that will reverse a string
public class reverseString {

    public static void main(String[]args){
        System.out.println(reverseWord("redwan"));

}
public static String reverseWord(String word){
    String empty="";
    for (int i=word.length()-1;i>=0;i--){
        empty=empty+ word.charAt(i);
    }
    return empty;
    }
}
