package Methods_In_Java;


/*
Write a Java program that defines a method called generateRandomNumbers which takes an integer parameter n. The method
should generate an array of n random integers between 1 and 100 (inclusive) and return this array. Ensure that each time
the program is run, it generates a different set of random numbers.
 */


import java.util.Arrays;
import java.util.Scanner;

public class ArraysAsMethod3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total random numbers to be generated");
        int n = s.nextInt();
        int[] rand = generateRandomNumbers(n);
        System.out.println(Arrays.toString(rand));
    }


    static int[] generateRandomNumbers(int r) {

        int[] random = new int[r];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
        return random;
    }

}
