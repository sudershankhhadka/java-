package Assigmments;

/*
Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name                 Year Of Joining          Address
Robert               1994                    664C-WallsStreat
Sam                  2000                    68D-WallsStreat
John                 1999                    26B-WallsStreat
 */


import java.util.Scanner;

public class QuestionNumber10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name , year of joining and Address:");
        for (int i = 0; i < 3; i++) {
            String name = s.next();
            int year = s.nextInt();
            String Address = s.next();
        }

    }
}
