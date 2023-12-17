
//WAP to calculate +,-,/,* of two integers using switch.

import java.util.Scanner;

public class Assignment2_Que2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the character :");
        char c = s.next().charAt(0);
        System.out.println("Enter the integers for the operration");
        int a = s.nextInt();
        int b = s.nextInt();
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
