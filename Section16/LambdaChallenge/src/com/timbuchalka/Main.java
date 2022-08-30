package com.timbuchalka;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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


//====================================================================================
        //Challenge #8
        //Question 1:
        //There are many interfaces in the Java SDK, and sometimes we can use a lambda
        //expression instead of creating an instance that implements the interface we
        //want to use.
        //Given a specific interface, how can we tell whether we can map a lambda
        //expression to it? What's the criteria that has to be met?

        //Question 1 answer:
        // 1) Should be a functional interface (contain only one method that must be implemented)
        // 2) An interface can be named as a functional interface even if it has several methods,
        //    but the only thing is that one method must be without implementation
        //    and the other ones should have a default implementation
        //    (Or you can look up in the interface's documentation whether it is 'functional' or not)


        //Question 2:
        //With that in mind, can we use a lambda expression to represent an
        //instance of the java.util.concurrent.Callable interface?

        //Question 2 answer:
        //https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html
        //This is a functional interface and can therefore be used as the assignment
        // target for a lambda expression or method reference.
        //
        //Answer: Yes we can. Because it has only one method and as well it is
        //        written in documentation that it is a functional interface.

        //Question 2:
        //Is the java.util.Comparator interface a functional interface?
        //Question 2 answer:
        //https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
        //Answer: Yes it is a functional interface.
        //        All methods beside "compare(T o1, T o2)" have default implementation.


//====================================================================================
        //Challenge #9
        //Write code to print the items in the list in sorted order, and with the first
        //letter in each name upper-cased. Use lambda expressions wherever possible.

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        //Challenge #9 solution:
        System.out.println();
        System.out.println("Challenge #9 solution:");

        List<String> sorted = new ArrayList<>();

//        topNames2015.forEach(name -> {
//            String first = name.substring(0, 1).toUpperCase();
//            String left = name.substring(1);
//            sorted.add(first + left);
//        });
//
//        Collections.sort(sorted); //my version
////        sorted.sort( (n1, n2) -> n1.compareTo(n2) ); //Tim's version
//
//        sorted.forEach(System.out::println); //my version
////        sorted.forEach( name -> System.out.println(name)); //Tim's version


//====================================================================================
        //Challenge #10
        //Change the code so that it uses method references "Class::MethodName"

        //Challenge #10 solution:
//        sorted.sort(String::compareTo);
//        sorted.forEach(System.out::println);


//====================================================================================
        //Challenge #11
//        topNames2015
//                .stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);


//====================================================================================
        //Challenge #12
        System.out.println();
        System.out.println("Challenge #12 solution:");
        long count = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println(count);


//====================================================================================
        //Challenge #13
//        topNames2015
//                .stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .peek(System.out::println)
//                .sorted(String::compareTo);

        //Answer is: nothing will happen


//====================================================================================
        //Challenge #14

        System.out.println();
        System.out.println("Challenge #14 solution:");
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());



    }//END main()

    private static String everySecondCharacter(Function<String, String> function, String inputString) {
        return function.apply(inputString);
    }

}
