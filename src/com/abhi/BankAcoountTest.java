package com.abhi;

import static org.junit.jupiter.api.Assertions.*;

class BankAcoountTest {

    private BankAcoount obj;

    @org.junit.jupiter.api.BeforeEach
    public void setup(){
        obj = new BankAcoount("Abhi",1000);
        System.out.println("Running a test ...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = obj.deposit(200);
       assertEquals(1200,balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        double balance = obj.withdraw(200);
        assertEquals(800,balance,0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        obj.deposit(200);
        assertEquals(1200,obj.getBalance(),0);
    }

}
