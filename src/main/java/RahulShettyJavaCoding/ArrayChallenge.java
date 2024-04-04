package RahulShettyJavaCoding;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int []arr= getRandomArray(5);
        System.out.println(Arrays.toString(arr));

        int[] sortedArray= sortIntegers(new int[] {7,30,35});
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}

