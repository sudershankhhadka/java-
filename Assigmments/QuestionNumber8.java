package Assigmments;
/*
Print the average of three numbers entered by user by creating a class named 'Average' having a method
to calculate and print the average.
 */

import java.util.Scanner;

class Average {

    Scanner s = new Scanner(System.in);

    public void average() {
        System.out.println("Enter the three numbers for calculating the average:");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        System.out.println("Average:" + (a + b + c) / 3);
    }

}

public class QuestionNumber8 {
    public static void main(String[] args) {
        Average a = new Average();
        a.average();
    }
}
