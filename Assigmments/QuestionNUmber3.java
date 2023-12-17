package Assigmments;
/*
Assign and print the roll number, phone number and address of two students having names "Sam" and
"John" respectively by creating two objects of class 'Student'.
 */

class Student1 {
    String name1 = "John";
    String name2 = "Sam";

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    int roll_number;
    int phone_number;
    String Address;


}

public class QuestionNUmber3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.setRoll_number(1);
        s2.setRoll_number(2);
        s1.setAddress("Bagbazar");
        s2.setAddress("Bhaktapur");
        s1.setPhone_number(789654123);
        s2.setPhone_number(741236985);
        System.out.println("For " + s1.name1);
        System.out.println(s1.getAddress() + " " + s1.getRoll_number() + " " + s1.getPhone_number());

        System.out.println("For " + s2.name2);
        System.out.println(s2.getAddress() + " " + s2.getRoll_number() + " " + s2.getPhone_number());
    }
}
