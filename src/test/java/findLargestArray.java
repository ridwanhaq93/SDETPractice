public class findLargestArray {
    public static void main(String[]args){
        int []arr= {1,5,6,7,69,34};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                smallest = arr[i];
            }else if (arr[i]>largest){
                largest =arr[i];
            }
        }
        System.out.println(largest);
    }
}