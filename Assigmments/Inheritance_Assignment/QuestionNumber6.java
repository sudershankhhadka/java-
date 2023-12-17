package Assigmments.Inheritance_Assignment;
/*
Create a class named 'Shape' with a method to print "This is This is shape". Then create two other
classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is
rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle'
having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by
the object of 'Square' class.
 */


class Shape {
    void print() {
        System.out.println("This  is shape.");
    }
}

class rectangle extends Shape {
    void print() {
        super.print();
        System.out.println("This is rectangle.");
    }
}

class circle extends Shape {
    void print() {
        System.out.println("This is circle.");
    }
}

class square extends rectangle {
    @Override
    void print() {
        super.print();
        System.out.println("Square is a rectangle.");
    }
}

public class QuestionNumber6 {
    public static void main(String[] args) {
        square s = new square();
        s.print();
    }
}
