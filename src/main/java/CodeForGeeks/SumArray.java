package CodeForGeeks;

import javax.sound.midi.SysexMessage;

//14. Write a Java Program to Compute the Sum of Array Elements.
//Input: [ 2, 4, 6, 7, 9]
//Output: 28
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum+arr[i];
            }

        System.out.println(sum);
    }
}

