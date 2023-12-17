
/*
    WAP to calculate the total salary of the following post:

    post        basic Salary        bonus       total salary
    ----        ------------        -----       ------------
    MD          230000              20%         ?
    CEO         250000              25.79%      ?
    MANAGER     176000              9%          ?
    HELPER      145900              9%          ?

 */

import java.util.Scanner;

public class Day_3__Assignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the post:");
        String post = s.next();
        if (post.equals("MD")) {
            double salary = 2300000 + (230000 * 20) / 100;
            System.out.println("Total Salary: " + salary);
        } else if (post.equals("CEO")) {
            double salary = 250000 + 250000 * 0.2579;
            System.out.println("Total Salary: " + salary);
        } else if (post.equals("MANAGER")) {
            double salary = 176000 + 176000 * 0.09;
            System.out.println("Total Salary: " + salary);
        } else if (post.equals("HELPER")) {
            double salary = 145900 + 145900 * 0.09;
            System.out.println("Total Salary: " + salary);
        } else {
            System.out.println("Wrong input");
        }
    }
}
