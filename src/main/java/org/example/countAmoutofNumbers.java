package org.example;
/*
Task #4:
        Create a function that accepts any numbers, it should check for each number should be able to be divided by 2
        then it should count numbers that are divided by 2 without Remainder.
        For example:
        Input: 14589
        Output: 2 (Because only 4 and 8 can be divided by 2)
*/

public class countAmoutofNumbers {
    public static void main(String[] args) {
        System.out.println(countNumbers(13589));
    }

    public static int countNumbers(int number) {
        int count = 0;
        if (number % 2 == 0) {
            count++;
        } else {
            number = number / 10;
        }
        return number;
    }
}