package Inheritance;

public class Programmer extends Employee {
    String prolang;
    String project;
    int bonus;


    void print() {
        super.print();
        System.out.println("Programming language:" + prolang);
        System.out.println("Current project:" + prolang);
        System.out.println("Bonus:" + bonus);
    }
}
