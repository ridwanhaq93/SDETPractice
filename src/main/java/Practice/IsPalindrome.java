package Practice;
//write a function to know where string is a palindrome
public class IsPalindrome {
    public static void main(String[]args){
        System.out.println(IsPalindrome2("anna"));


    }

    public static boolean IsPalindrome2(String word){
        String empty="";
        for (int i=word.length()-1;i>=0;i--){
            empty =empty+ word.charAt(i);
        }
        return word.equals(empty);
    }
}
