package RahulShettyJavaCoding;

import javafx.scene.SubScene;

public class SumOfElementsArray {

    //create a method which accepts int array as parameter and returns the sum of all the elements in an array
    public static void main(String[] args) {
        System.out.println(sum(new int[]{2,3}));
    }
public static int sum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
    return sum;
}
}

