package Practice;

import java.util.Arrays;

//Write a method that will take an array as an argument and reverse it.
public class SDET2ArrayReverse {
    public static void main(String[]args){
        int []arr2 = {3,4,6,7,8};
      reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void reverseArray(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
