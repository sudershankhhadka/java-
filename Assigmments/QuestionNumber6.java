package Assigmments;

/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a
class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed
as parameters to its constructor.
 */
class Rectangle {
    //    int l,b;
    public int Area(int a, int b) {
        return a * b;
    }
}

public class QuestionNumber6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.Area(4, 5));
        System.out.println(r.Area(5, 8));
    }
}
