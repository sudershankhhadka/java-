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
public class employee {
    int id;
    String name;
    String company;
    int salary;
    String department;
    String post;
    String city;

    public int getId() {
        return id;
    }

    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
