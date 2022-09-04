package com.timbuchalka;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @Before
    public void setup(){
        bankAccount = new BankAccount("Vlad", "Kcs", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() {
        double balance = bankAccount.deposit(200.0, true);
        assertEquals(1200.0, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        double balance = bankAccount.withdraw(600.0, true);
        assertEquals(400.0,balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        bankAccount.withdraw(600.0, false);
        fail("Should be thrown an IllegalArgumentException");
    }

//    @Test
//    public void withdraw_notBranch() throws Exception{
//        try {
//            bankAccount.withdraw(600.0, false);
//            fail("Should be thrown an IllegalArgumentException");
//        } catch(IllegalArgumentException e){
//
//        }
//    }

    @Test
    public void getBalance_deposit() {
        bankAccount.deposit(200.0, true);
        assertEquals(1200.0, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        bankAccount.withdraw(200.0, true);
        assertEquals(800.0, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true(){
//        assertEquals(true, bankAccount.isChecking());
        assertTrue("The account is NOT a checking account", bankAccount.isChecking());
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @After
    public void teardown(){
        System.out.println("Count = " + count++);
    }


}