package Assigmments.Inheritance_Assignment;
/*
4.
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to
print the area and perimeter of the rectangle respectively. Its constructor having parameters for length
and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the
'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor
of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
 */


class Rectangle {
    int length;
    int breadth;

    void area() {
        System.out.println("Area:" + length * breadth);
    }

    void perimeter() {
        System.out.println("Perimeter:" + 2 * (length + breadth));
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);

    }
}

public class QuestionNumber4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 8);
        Square s = new Square(4);
        r.area();
        r.perimeter();
        s.area();
        s.perimeter();
    }

}
