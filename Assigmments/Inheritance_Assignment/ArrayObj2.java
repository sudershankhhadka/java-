package Assigmments.Inheritance_Assignment;


/*
 * Q> WAP to store and print data
 *    of 10 Employees(id,name,company,salary,department,post,city):
 *
 *    a> find total salary of employee.
 *    b> print employees of IT department.
 *    c> count employees of Admin department.
 *    d> count and print employees of particular city.
 *    e> calculate total salary of particular department.
 *    f> find highest and lowest salary of employee.
 */

import java.util.Scanner;

public class ArrayObj2 {
    public static void main(String[] args) {
        employee a[] = new employee[2];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            employee e = new employee();
            System.out.println("Enter the id,name,salary,department,post,city:");
            int id = s.nextInt();
//			String name = s.next();
//			String company = s.next();
//			int salary =s.nextInt();
//			String department = s.next();
//			String post = s.next();
//			String city = s.next();
            a[i] = e;
        }
        for (employee as : a) {
            System.out.println(as);
        }
    }
}
