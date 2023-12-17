package Aggregation;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("black");
        c.setModel("Hyundai");
        c.setPrice(23454323);


        Employee e = new Employee();
        e.setId(12);
        e.setName("Ram Bahadur");
        e.setSalary(2343232);
        e.setC(c);
        System.out.println("Id:" + e.getId());
        System.out.println("Name:" + e.getName());
        System.out.println("Salary:" + e.getSalary());
        System.out.println("------------carinfo--------------");
        System.out.println("Color:" + c.getColor());
        System.out.println("Model:" + c.getModel());
        System.out.println("Price:" + c.getPrice());
    }
}
