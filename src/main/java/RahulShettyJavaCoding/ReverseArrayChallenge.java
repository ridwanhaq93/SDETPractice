package RahulShettyJavaCoding;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[]args){
  int []arr={2,3,4};
  revese(arr);
  System.out.println(Arrays.toString(arr));

    }

    public static void revese(int[]arr){
        int start=0;
        int end= arr.length-1;

        while (start<end){
            int temp= arr[0];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
}
