package Oops.src.Aman.Challenge;

public class BankAccount {
    private String accnumber;
    private String accholderName;
    private long balance;
    public void deposit(double money){
        balance+=money;
    }
    public void withdraw(double money){
        balance-=money;
    }

}
