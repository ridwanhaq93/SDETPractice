import java.util.ArrayList;
import java.util.List;

public class CountingAmountOfNumbers {
/*    Task #3:
    Create a function which will take a numbers and count amount of numbers (length of integers) only. You are not allowed to convert Integers to string and use .Length() method.
    For example:
    Input: 36 - Out: 2
    Input 7587 - Out: 4

*/
    public static void main(String[]args) {
       int count1=countDigits(35);
        System.out.println("  Out: " + count1);

    }

        public static int countDigits(int number){
            if (number==0){
                return 1;
            }
            int count=0;
            while (number!=0){
                number = number/10;
                count++;
            }
            return count;

        }
    }



