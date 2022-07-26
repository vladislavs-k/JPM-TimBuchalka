package com.timbuchalka;

import java.util.Scanner;

/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message "Enter number:"
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true){

            System.out.print("Enter number: ");
            boolean hasAnInt = scanner.hasNextInt();

            if(hasAnInt){

                int number = scanner.nextInt();

                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }

            } else {
                break;
            }
        }

        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);

        scanner.close();
    }
}
