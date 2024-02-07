package Abstraction;


public abstract class CentralBank {
    abstract void getBankName();
    abstract void interestRate();
    void moneyExchangeRate(){
        System.out.println("1$ = 132npr");
        System.out.println("KDD 1 = 16npr");
        System.out.println("IC 100  = 160npr");
    }
}
