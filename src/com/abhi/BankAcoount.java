package com.abhi;

public class BankAcoount {

    private String name;
    private double balance;

    public BankAcoount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount){
        balance+=amount;
        return  balance;
    }

    public double withdraw(double amount){
        balance+=amount;
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAcoount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
