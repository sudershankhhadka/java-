package Abstraction;

public class UserSer implements UserService,CommonService{
    @Override
    public void addUser() {
        System.out.println("Added");
    }

    @Override
    public void userName() {
        System.out.println("Ram");
    }

    @Override
    public void print() {

    }
}
