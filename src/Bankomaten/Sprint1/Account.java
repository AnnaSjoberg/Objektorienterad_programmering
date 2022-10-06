package Bankomaten.Sprint1;

public class Account {
    private final String number;
    private double interest;
    private double balance;

    public Account(String number, double interest, double balance) {
        this.number = number;
        this.interest = interest;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
