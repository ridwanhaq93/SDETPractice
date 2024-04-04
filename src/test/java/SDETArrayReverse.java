import java.util.Arrays;
public class SDETArrayReverse {
    public static void main(String[] args) {
    int[] inputArr =  {1, 2, 3, 4, 5};
     //   System.out.println(Arrays.toString(inputArr)); // [1, 2, 3, 4, 5]
        reverseArray(inputArr);
        System.out.println(Arrays.toString(inputArr)); // [5, 4, 3, 2, 1]
    }



        public static void reverseArray(int []arr){

        int start = 0;
        int end= arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }
}
    }