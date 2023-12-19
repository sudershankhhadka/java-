package Method_Overriding;

public class Bank2 extends CentalBank{
    @Override
    void getBankName() {
        System.out.println("Nabil Bank");
    }

    @Override
    void interestRate() {
        System.out.println("23");
    }
}
