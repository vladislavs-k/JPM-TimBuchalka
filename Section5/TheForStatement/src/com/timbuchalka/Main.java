package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        System.out.println();
        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.1f", calculateInterest(10000.0, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        System.out.println();
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.1f", calculateInterest(10000.0, i)));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        System.out.println();
        int countPrime = 0;
        for (int i = 10; i < 50; i++){
            if(isPrime(i)){
                System.out.println("The prime number: " + i);
                countPrime++;
                if (countPrime == 3)
                    break;
            }
        }

    }//END main()

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
//            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * interestRate / 100);
    }
}
