package Abstraction;

public class Test {
    public static void main(String[] args) {
        CentralBank b  = new KumariBank();
        b.getBankName();
        b.interestRate();
        b.moneyExchangeRate();
        UserSer u =  new UserSer();
        u.addUser();
        u.userName();
        u.print();
    }
}
