package com.timbuchalka;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Vlad", "Kcs", 1000.0, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.0, true);
        assertEquals(1200.0, balance, 0);
    }

    @Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @Test
    public void getBalance_deposit() {
        BankAccount bankAccount = new BankAccount("Vlad", "Kcs", 1000.0, BankAccount.CHECKING);
        bankAccount.deposit(200.0, true);
        assertEquals(1200.0, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("Vlad", "Kcs", 1000.0, BankAccount.CHECKING);
        bankAccount.withdraw(200.0, true);
        assertEquals(800.0, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("Vlad", "Kcs", 1000.0, BankAccount.CHECKING);
//        assertEquals(true, bankAccount.isChecking());
        assertTrue("The account is NOT a checking account", bankAccount.isChecking());
    }


}