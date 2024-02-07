package ObjectWithMethodPractice;


public class Test
{
    public static void main(String[] args) {

        Test t = new Test();
        Samriddhi []o = t.getDetails();
        for(Samriddhi s: o) {
            t.printDetails(s);
        }

    }
    void printDetails(Samriddhi sm){
        System.out.println("Student ID: "+sm.getStudent_id());
        System.out.println("Faculty: "+sm.getFaculty());
        System.out.println("Class Number:"+sm.getClass_no());
    }


    Samriddhi[] getDetails(){
        Samriddhi[] m = new Samriddhi[2];
        for(int i=0;i<m.length;i++) {
            Samriddhi d = new Samriddhi();
            d.setStudent_id(12);
            d.setFaculty("BCA");
            d.setClass_no(23);
            m[i] = d;

        }
        return m;
    }
}
