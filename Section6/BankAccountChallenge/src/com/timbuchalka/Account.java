package com.timbuchalka;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public Account() {
        this(000000000, 0d,
                "No Name", "no@email.com",
                00000000);
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String customerName,
                   String customerEmail, int customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount){
        if (withdrawalAmount <= this.balance){
            this.balance -= withdrawalAmount;
        } else {
            System.out.println("Request denied. Check your balance!");
        }

    }
}
