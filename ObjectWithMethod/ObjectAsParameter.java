package ObjectWithMethod;

public class ObjectAsParameter {
    public static void main(String[] args) {
        ObjectAsParameter o = new ObjectAsParameter();

        Student sd = o.setName();
        o.getName(sd);
    }

    Student setName() {
        Student s = new Student();
        s.setId(1);
        s.setFname("Sudershan");
        s.setLname("Khadka");
        s.setCollege("Canvas");
        s.setCity("Kathmandu");
        s.setAge(22);
        return s;
    }

    void getName(Student s) {
        System.out.println("Id:" + s.getId());
        System.out.println("Name: " + s.getFname() + " " + s.getLname());
        System.out.println("Age:" + s.getAge());
    }

}
