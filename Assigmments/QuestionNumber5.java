package Assigmments;
/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
class named 'Triangle' with constructor having the three sides as its parameters.
 */

class Triangle1 {
    int a, b, c;

    public void area(int a, int b, int c) {
        int s = (a + b + c) / 2;
        int area = s * (s - a) * (s - b) * (s - c);
        System.out.println("Area :" + area);
    }

    public void perimeter(int a, int b, int c) {
        int p = a + c + b;
        System.out.println("Perimeter:" + p);
    }
}

public class QuestionNumber5 {
    public static void main(String[] args) {
        Triangle1 t = new Triangle1();
        t.area(3, 4, 5);
        t.perimeter(3, 4, 5);
    }
}
