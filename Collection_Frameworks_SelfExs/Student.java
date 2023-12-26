package Collection_Frameworks_SelfExs;

import java.util.Objects;

public class Student {
 String name ;
 String address;
 int number;
 String guardian_details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGuardian_details() {
        return guardian_details;
    }

    public void setGuardian_details(String guardian_details) {
        this.guardian_details = guardian_details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getNumber() == student.getNumber() && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress()) && Objects.equals(getGuardian_details(), student.getGuardian_details());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getNumber(), getGuardian_details());
    }
}
