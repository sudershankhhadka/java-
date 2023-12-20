package ObjectWithMethodPractice;

public class Samriddhi {
    private int student_id;
    private String Faculty;
    private int class_no;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    @Override
    public String toString() {
        return "Samriddhi{" +
                "student_id=" + student_id +
                ", Faculty='" + Faculty + '\'' +
                ", class_no=" + class_no +
                '}';
    }
}
