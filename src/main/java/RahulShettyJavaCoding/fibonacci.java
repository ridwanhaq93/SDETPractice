package RahulShettyJavaCoding;

public class fibonacci {

    //print first 10 numbers of fibonacci series

    public static void main(String[] args) {
finacchi();
    }

    public static void finacchi() {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        //now looping from 2 to 10 since first 2 are already decleared
        for (int i = 2; i < 10; i++) {
            int nextnum = num1 + num2;
            System.out.println(nextnum);

            num1 = num2;
            num2 = nextnum;
        }
    }
}
