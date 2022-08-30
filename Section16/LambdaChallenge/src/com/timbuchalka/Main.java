package com.timbuchalka;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//====================================================================================
        //Challenge #1
        //Write the following anonymous class as a lambda expression:
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part: parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//        runnable.run();

        //Challenge #1 solution:
        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnable1.run();



//====================================================================================
        //Challenge #2
        //Write the following method as a lambda expression.
        // Don't worry about assigning it to anything:
//        public static String everySecondChar(String source){
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//            }
//
//            return returnVal.toString();
//        }

        //Challenge #2 solution:
        Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };



//====================================================================================
        //Challenge #3
        //Right now, the function doesn't do anything.
        //Write the code that will execute the function with an argument of "1234567890"

        //Challenge #3 solution:
        System.out.println();
        System.out.println("Challenge #3 solution:");
        String everySecond = lambdaFunction.apply("1234567890");
        System.out.println(everySecond);



//====================================================================================
        //Challenge #4
        //Instead of executing this function directly, suppose we want to pass it to a
        //method. Write a method called everySecondCharacter that accepts the function
        //as a parameter and executes it with the argument "1234567890"
        //It should return the result of the function. For bonus points,
        // don't hard-code the argument string within the method
//------------------------------------------------------------------------------------
        //Challenge #5
        //Using the bonus version, call the method with the lambdaFunction we created
        //earlier and the string "1234567890". Print the result returned from the method.

        //Challenge #4 & #5 solution:
        System.out.println();
        System.out.println("Challenge #4 & #5 solution:");
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));



//====================================================================================
        //Challenge #6
        //Now write a lambda expression that maps to the java.util.Supplier interface.
        //This lambda should return the string "I love Java!". Assign i to a variable
        //called iLoveJava

        //Challenge #6 solution:
        Supplier<String> iLoveJava = () -> "I love Java!";



//====================================================================================
        //Challenge #7
        //As with Function, the Supplier won't do anything until we use it. Use this
        //supplier to assign the string "I love Java!" to a variable called supplierResult
        //Then print the variable to the console.

        //Challenge #7 solution:
        System.out.println();
        System.out.println("Challenge #7 solution:");
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


    }//END main()

    private static String everySecondCharacter(Function<String, String> function, String inputString){
        return function.apply(inputString);
    }

}
