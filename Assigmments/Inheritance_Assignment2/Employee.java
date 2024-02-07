package Assigmments.Inheritance_Assignment2;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public void setName(String name) {

    }

    public void raiseSalary() {

    }

    public int getEmpId() {
        return empId;
    }

    public String getSsn() {
        return ssn;
    }
}


class Engineer extends Employee {

}

class Admin extends Employee {

}

class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }
}

class Director extends Manager {
    private double budget;

    public double getBudget() {
        return getBudget();
    }
}