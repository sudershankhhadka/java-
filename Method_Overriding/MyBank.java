package Method_Overriding;

public class MyBank extends CentalBank {
    @Override
    void getBankName() {
        System.out.println("Prabhu Bank");
    }

    @Override
    void interestRate() {
        System.out.println("12");
    }
}
