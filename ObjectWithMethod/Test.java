package ObjectWithMethod;

public class Test {
    public static void main(String[] args) {


        Test t = new Test();

        Student d = t.getStudentData();

        t.printStudent(d);
        Student s[] = t.getAlltudents();
        for(Student sd : s){
            System.out.println(sd);
        }
    }
    //Object as  a parameter

    void printStudent(Student s) {
        System.out.println("Id:" + s.getId());
        System.out.println("Name" + s.getFname() + " " + s.getLname());
        System.out.println("Address:" + s.getCity());
        System.out.println("College:" + s.getCollege());
    }

    Student getStudentData() {
        Student sd = new Student();
        sd.setId(232);
        sd.setFname("Sudershan");
        sd.setLname("Khadka");
        sd.setAge(21);
        sd.setCollege("Samriddhi");
        sd.setCity("Basundhara");
        return sd;
    }


    //for all students i.e.     using array of objects
        Student[] getAlltudents(){
        Student[] stds = new Student[2];
            for(int i=0;i<stds.length;i++){
                Student sd = new Student();
                sd.setId(232);
                sd.setFname("Sudershan");
                sd.setLname("Khadka");
                sd.setAge(21);
                sd.setCollege("Samriddhi");
                sd.setCity("Basundhara");
                stds[i] = sd;
            }

            //we can make it dynamic using Scanner.

            return stds;
        }

}
