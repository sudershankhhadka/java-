package Arrays;


/*
---> used to manage data in row and column or matrix form

syntax:
        data_type  array_name[] = new data_type[row][column];
 */

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        int mat[][] = new int[2][2];
        //writing and reading data
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the value:");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
