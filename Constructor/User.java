package Constructor;

public class User {
    //instance variable
    String user;
    String password;
    //-----------default constructor------------

//    User(){
//        user = "root";
//        password = "23232";
//    }

    //--------parameterized constructor--------------

    User(String un, String pw) {
        user = un;
        password = pw;

        //-------usecase of this
        /*
        this();  //for callling default constructor
        this("parameters")  //for calling parameterized cnstructors
         */
    }

    void printUser() {
        System.out.println("UserName :" + user);
        System.out.println("Password :" + password);
    }

    public static void main(String[] args) {
        User u = new User("saudernsj", "ascaca");
        u.printUser();

        // new User().printUser();  -->shortHand
    }
}
