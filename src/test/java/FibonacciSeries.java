public class FibonacciSeries {
    // Method to print first 10 numbers in Fibonacci series
    public static void main(String[] args) {
        int num1 = 0, num2 = 1; // Starting numbers of the Fibonacci series 0 and 1
        System.out.println(num1); // Printing the first number
        System.out.println(num2); // Printing the second number
        // Loop to calculate the next 8 numbers since the first two are already printed
        for (int i = 2; i < 10; i++) {
            int nextNum = num1 + num2; // Adding the last two numbers to get the next
            System.out.println(nextNum); // Printing the next number
            num1 = num2; // Updating the previous number
            num2 = nextNum; // Updating the last number with the newest number in the series
        }
    }


}