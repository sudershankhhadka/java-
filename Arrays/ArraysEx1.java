package Arrays;
//for storing name of 10 books and their price with total and average price

import java.util.Scanner;

public class ArraysEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int average;
        int total = 0;
        System.out.println("ENter the prices of the books");
//        String[]  bookname = new String[3];
        int[] bookprice = new int[3];
        for (int i = 0; i < bookprice.length; i++) {
            bookprice[i] = s.nextInt();
            total += bookprice[i];
        }
        average = total / bookprice.length;
        System.out.println("The prices of the books are:");
        for (int i = 0; i < bookprice.length; i++) {
            System.out.print(bookprice[i] + " ");
        }
        System.out.println("Total:" + total);
        System.out.println("Average:" + average);
    }
}