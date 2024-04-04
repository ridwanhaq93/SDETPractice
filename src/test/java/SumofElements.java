public class SumofElements {

    //create a method which accepts array and returns the sum of all the elements in an array
    public static void main(String[] args) {
        sum(new int[]{21,3});
    }

    public static void sum(int []arr){
        int sum=0;
    for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            sum =arr[i]+arr[j];
        }
    }
    System.out.println( sum);
    }
}