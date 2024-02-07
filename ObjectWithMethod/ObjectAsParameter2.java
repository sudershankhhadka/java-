package ObjectWithMethod;


/*
Write a Java program that defines a class called Rectangle with attributes length and width. Implement a method called
calculateArea that takes an object of type Rectangle as a parameter and calculates the area of the rectangle. Also,
implement a main method to test your program.
 */
public class ObjectAsParameter2 {
    public static void main(String[] args) {
        ObjectAsParameter2 o = new ObjectAsParameter2();

    }

    Rectangle setParameters() {
        Rectangle r = new Rectangle();
        r.setLength(14);
        r.setBreadth(12);
        return r;
    }

    void calculateArea(Rectangle r) {
        System.out.println("Area:");

    }
}
