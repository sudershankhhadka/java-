package Method_Overriding;

public class Test {
    public static void main(String[] args) {
        //static or early binding
        MyBank  m = new MyBank();
        m.getBankName();
        m.interestRate();



        //upcasting
        CentalBank b  = new Bank2();

        b.getBankName();
        b.moneyExchangeRate();
        b.interestRate();
    }

    //runtime polymorphism
    //dynamic or late binding
    //dynamic method dispatch

    void printBnakInfo(CentalBank b){
        b.getBankName();
        b.interestRate();
    }
}
