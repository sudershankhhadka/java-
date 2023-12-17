package Assigmments.Inheritance_Assignment;

import java.util.Scanner;

public class ArrayObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square2 s[] = new Square2[10];
        for (int i = 0; i < 10; i++) {
            Square2 s1 = new Square2();
            System.out.println("Enter the lenght");
            int l = sc.nextInt();
            s1.printArea(l);
        }
        for (Square2 a : s) {
            System.out.println(a);
        }
    }
}


