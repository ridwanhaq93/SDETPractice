package Practice;
//Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.
public class MaxNumber {

    public static void main(String[]args){
        System.out.println(maxArr(new int[]{2,3,2,2}));
    }

    public static int maxArr(int []arr){
    int max=arr[0];
    int min=arr[0];
    for (int i=0;i<arr.length;i++){
        if (arr[i]<min){
            min=arr[i];
        }else if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    }

}