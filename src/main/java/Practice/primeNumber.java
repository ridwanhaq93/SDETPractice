package Practice;

import javax.swing.text.html.StyleSheet;

//4. Prime number. A prime number is a number that can only be divided by itself and 1 without remainder.
public class primeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(3));

    }
   public static boolean isPrime(int num){
    //start iterating from 2 to half inclusive
       for (int i=2;i<num/2;i++){
           if (num %i ==0){
               return false;
           }
       }
       return true;
    }





    public static boolean IsPrime(int number){
        for (int i=2;i<number/2;i++){
            if (number % i ==0){
                return false;
            }
        }
        return true;
    }
}