package Practice;
/*
*Find the second min/max number from an array. Write a method that accepts
*  an int array as an argument and returns a second or n min/max number from the given array */


public class MaxMinNumber {
    public static void main(String[] args) {
        System.out.println(SeoncMax(new int[]{4, 781, 8, 99, 103})); // 103


    }

    public static int SeoncMax(int[] arr) {
        int maxIndex = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }


        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i != maxIndex && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
/*public class findSecondLargestNumberinArray {
    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 23, 45, 12};
       *//* int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }
        for (int value : arr) {
            if (value > highest) { // Update highest if current value is greater
                secondHighest = highest;
                highest = value;
            } else if (value > secondHighest && value != highest) { // Update secondHighest if value is between highest and secondHighest
                secondHighest = value;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest value");
        } else {
            System.out.println("Second highest number is: " + secondHighest);
        }
    }
}*/