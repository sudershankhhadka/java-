package Assigmments.Inheritance_Assignment;
/*
Now repeat the above example to print the area of 10 squares.
Hint-Use array of objects.
 */


import java.util.Scanner;

class Book {
    String name;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class QuestionNumber5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Book b[] = new Book[3];

        for (int i = 0; i < 3; i++) {
            Book b1 = new Book();
            System.out.println("Enter the name of book:");
            b1.name = s.next();


            b[i] = b1;
        }


        for (Book bk : b) {
            System.out.println(bk);
        }


    }
}
