package Assigmments;


/*
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered
through keyboard.
 */


import java.util.Scanner;

class Area {
    double length;
    double breadth;

    public void setDim(double l, double b) {
        length = l;
        breadth = b;

    }

    public double getArea() {
        return length * breadth;
    }
}

public class QuestionNumber1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Area a = new Area();
        System.out.print("Enter the length and breadth of the rectangle:");
        double l = s.nextDouble();
        double b = s.nextDouble();

        a.setDim(l, b);
        System.out.println(a.getArea());
    }
}
