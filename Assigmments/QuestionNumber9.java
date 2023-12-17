package Assigmments;
/*
Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with
separate methods for each operation whose real and imaginary parts are entered by user.
 */


import java.util.Scanner;

class Complex {

    public void sum(int a, int b) {
        System.out.println("Sum :" + (a + b));
    }

    public void difference(int a, int b) {
        System.out.println("Difference :" + (a - b));
    }

    public void product(int a, int b) {
        System.out.println("Product:" + (a * b));
    }
}

public class QuestionNumber9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two numbers of whose values are to be calculated:");
        int a = s.nextInt();
        int b = s.nextInt();
        Complex c = new Complex();
        c.sum(a, b);
        c.product(a, b);
        c.difference(a, b);

    }
}
