package Abstraction;



public class KumariBank extends CentralBank {

    @Override
    void getBankName() {
        System.out.println("Kumari Bank");
    }

    @Override
    void interestRate() {
        System.out.println("12%");
    }
}
