package Practice;

public class reverseWords {
    public static void main(String[]args){
        String wordSentence="I am the King of Bollywood";

        String empty="";
        for (int i=wordSentence.length()-1;i>=0;i--){

            empty = empty+ wordSentence.charAt(i);
        }
        System.out.println(empty);
    }
}
