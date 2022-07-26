package com.timbuchalka;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually was a " + switchValue);
                break;


            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        // Challenge:
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'f';

        switch (Character.toUpperCase(switchChar)) {
            case 'A':
                System.out.println("Char A was used");
                break;

            case 'B':
                System.out.println("Char B was used");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("Char C, D or E was used");
                break;

            default:
                System.out.println("Non of A to E chars was used");
                break;
        }

        String month = "June";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
