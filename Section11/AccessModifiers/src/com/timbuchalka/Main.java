package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Account vladsAccount = new Account("Vlad");
        vladsAccount.deposit(1000);
        vladsAccount.withdraw(500);
        vladsAccount.withdraw(-200);
        vladsAccount.deposit(-20);

        vladsAccount.calculateBalance();
        vladsAccount.balance = 5000;

        System.out.println("Balance on account is " + vladsAccount.getBalance());
        vladsAccount.transactions.add(4500);
        vladsAccount.calculateBalance();
    }
}
