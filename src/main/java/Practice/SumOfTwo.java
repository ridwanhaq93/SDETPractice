/*
package Practice;

import java.util.Arrays;

Write a method that accepts an int[] array and an int number,
 and find 2 elements in the array that sum is equal to the given int.
 Assume that an input array will have only one pair of numbers that sum equal
 to our given number. It will always have this pair.
See input and output examples. I use the Brute Force algorithm.



public class SumOfTwo {
public static void main(String[]args){
    System.out.println(Arrays.toString(sum(new int[]{1, 2, 3, 5}, 4))); // [1, 3]

}
public static int[]sum(int []arr,int number){
    int []sumNumbers= new int[2];
    for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if (arr[i] + arr[j] == number){
                sumNumbers[0]= arr[i];
                sumNumbers[1]=arr[j];
            }
        }
    }
    return sumNumbers;
}

public static int[]sum(int[]arr, int number){
    int[] sum= new int[2];

    for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
    if(arr[i]+arr[j]==number){
        sum[0]=arr[i];
        sum[1]=arr[j];
    }
        }
    }
    return sum;
}
        }
*/
