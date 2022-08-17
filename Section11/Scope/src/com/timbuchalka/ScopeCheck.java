package com.timbuchalka;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for (int i=0; i<10; i++){
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class InnerClass{
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("Inner class created, privateVar is " + privateVar);
        }

        public void timesTwo(){
//            int privateVar = 2;
            ScopeCheck.this.timesTwo();
            for (int i=0; i<10; i++){
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }

    }
}
