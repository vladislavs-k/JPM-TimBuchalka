package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while (count <= 10){
            System.out.print("Enter number #" + count + ": ");
            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.next();
            }
        }

        System.out.println("The sum of entered numbers is: " + sum);

        scanner.close();
    }
}
