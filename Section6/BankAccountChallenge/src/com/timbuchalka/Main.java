package com.timbuchalka;

// Create a new class for a bank account
// Create fields for the account number,
// balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds
// (this should increment the balance field).
// 2. To allow the customer to withdraw funds.
// This should deduct from the balance field,
// but not allow the withdrawal to complete
// if their are insufficient funds.
// You will want to create various code in the
// Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Main {

    public static void main(String[] args) {
//        Account account = new Account();

//        Account account = new Account(123456789, 0d,
//                "Bob Jones", "bob@jones.com",
//                23232323);

//        System.out.println();

//        account.withdraw(100);
//        account.deposit(50);
//        account.withdraw(100);
//        account.deposit(51);
//        account.withdraw(100);
//        System.out.println();

//        account.setAccountNumber(123456789);
//        account.setBalance(0.0);
//        account.setCustomerName("Bob Jones");
//        account.setCustomerEmail("bob@jones.com");
//        account.setCustomerPhoneNumber(23232323);

//        System.out.println("Account number is: " + account.getAccountNumber());
//        System.out.println("Account initial balance: " + account.getBalance());
//        System.out.println("Customer's name: " + account.getCustomerName());
//        System.out.println("Customer's e-mail: " + account.getCustomerEmail());
//        System.out.println("Customer's phone number: " + account.getCustomerPhoneNumber());
//        System.out.println();

//        account.deposit(1000.0);
//        System.out.println("Bank account balance is: " + account.getBalance());
//        account.withdraw(500.0);
//        System.out.println("Bank account balance is: " + account.getBalance());
//        account.deposit(3000.0);
//        System.out.println("Bank account balance is: " + account.getBalance());
//        System.out.println();
//        account.withdraw(9500.0);
//        System.out.println("Bank account balance is: " + account.getBalance());
//        account.withdraw(3500.0);
//        System.out.println("Bank account balance is: " + account.getBalance());

//        Account myAccount = new Account("Vlad", "vlad@vlad.com",88888888);
//        System.out.println(myAccount.getAccountNumber() + " name " + myAccount.getCustomerName());



        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
        
        VipCustomer vipCustomerZero = new VipCustomer();
        System.out.println(vipCustomerZero.getName());
        System.out.println(vipCustomerZero.getCreditLimit());
        System.out.println(vipCustomerZero.getEmailAddress());
        System.out.println();
        
        VipCustomer vipCustomerTwo = new VipCustomer("Bob", "bob@bob.com");
        System.out.println(vipCustomerTwo.getName());
        System.out.println(vipCustomerTwo.getCreditLimit());
        System.out.println(vipCustomerTwo.getEmailAddress());
        System.out.println();
        
        VipCustomer vipCustomerThree = new VipCustomer("Greg", 1000000d, "greg@million.com");
        System.out.println(vipCustomerThree.getName());
        System.out.println(vipCustomerThree.getCreditLimit());
        System.out.println(vipCustomerThree.getEmailAddress());
        System.out.println();
        
    }
}
