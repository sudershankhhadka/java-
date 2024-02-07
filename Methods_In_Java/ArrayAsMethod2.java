package Methods_In_Java;
/*
    Write a Java method that takes an array of integers as input and returns the sum of all the positive integers in the array.
    If the array is empty or contains only non-positive integers, the method should return 0. Provide the method signature and an
     example of how to use it.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAsMethod2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = s.nextInt();
        int[] array = new int[num];

        arraySum(array);
        int[] arr = arrReturn();
        System.out.println(Arrays.toString(arr));
    }


    static void arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                return;
            } else {
                sum += i;
            }

        }
        System.out.println("The sum is :" + sum);
    }


    static int[] arrReturn() {
        int[] even = new int[10];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            even[i] = j;
            j += 2;

        }
        for (int y : even) {
            System.out.println(y);
        }
        return even;
    }

}