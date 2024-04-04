package CodeForGeeks;
// Write a Java Program to Find the Largest Element in Array
//Input: [ 7, 2, 5, 1, 4]
//Output: 7
public class LargestElementInArray {
    public static void main(String[]args){
        int []inputArr= new int[]{7,2,5,1,4};
        int max=inputArr[0];
        for (int i=0;i<inputArr.length;i++){
            if (inputArr[i]>max){
                max=inputArr[i];
            }
        }
        System.out.println(max);
    }
}
