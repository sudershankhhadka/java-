package Assigmments;


/*
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
class named 'Triangle' without any parameter in its constructor.
 */
class Triangle {
    int a = 3;
    int b = 4;
    int c = 5;
    int s = (a + b + c) / 2;

    public void area() {
        System.out.println("Area of the triangle is:" + s * (s - a) * (s - b) * (s - c));
    }

    public void perimeter() {
        System.out.println("Perimeter of the triangle is:" + (a + b + c));
    }

}

public class QuestionNumber4 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }
}
