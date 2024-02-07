package ObjectWithMethodPractice;

public class GateSensor {
    private int no_of_people_entered;
    private String name;
    private boolean passcode;
    private String relation;

    public int getNo_of_people_entered() {
        return no_of_people_entered;
    }

    public void setNo_of_people_entered(int no_of_people_entered) {
        this.no_of_people_entered = no_of_people_entered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPasscode() {
        return passcode;
    }

    public void setPasscode(boolean passcode) {
        this.passcode = passcode;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "GateSensor{" +
                "no_of_people_entered=" + no_of_people_entered +
                ", name='" + name + '\'' +
                ", passcode=" + passcode +
                ", relation='" + relation + '\'' +
                '}';
    }
}
