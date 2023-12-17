package Arrays;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ages");
        int[] age = new int[5];
        for (int i = 0; i < age.length; i++) {
            age[i] = s.nextInt();
        }
        for (int x : age
        ) {
            System.out.print(x + " ");
        }

    }
}
