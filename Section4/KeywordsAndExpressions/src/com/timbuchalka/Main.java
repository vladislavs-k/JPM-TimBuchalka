package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometer
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50){
            System.out.println("This is an expression");
        }


        // In the following code that I will type below,
        // write down what parts of the code are expressions.
        int score = 100;    // 'score = 100' is an expression
        if (score > 99) {   // 'score > 99'  is an expression
            System.out.println("You got the high score");   // '"You got the high score"' is an expression
            score = 0;  // 'score = 0' is an expression
        }
    }
}
