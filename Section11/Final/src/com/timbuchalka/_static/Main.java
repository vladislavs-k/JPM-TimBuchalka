package com.timbuchalka._static;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.instanceNumber);
//        System.out.println(two.instanceNumber);
//        System.out.println(three.instanceNumber);
//
////        one.instanceNumber = 4;
//        System.out.println(Math.PI);
////        Math m = new Math();
//
//        int pw = 589547;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(46489365);
//        password.letMeIn(9874);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(589547);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);


    }
}
