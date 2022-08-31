package com.timbuchalka;

import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//==========================================
        //Challenge #1
        //Write the string literal regular expression that will match the followingString.
        //Use the String.matches() method to verify your answer.

        //Challenge #1 solution:
        String challenge1 = "I want a bike.";
        System.out.println("Challenge #1:");
        System.out.println(challenge1.matches("I want a bike."));


//==========================================
        //Challenge #2
        //Now write a regular expression that will match "I want a bike." and "I want a ball."
        //Verify answer using the matches() method

        //Challenge #2 solution:
        String challenge2 = "I want a ball.";
        String regexCh2 = "I want a b.{4}";
        System.out.println("\nChallenge #2:");
        System.out.println(challenge1.matches(regexCh2));
        System.out.println(challenge2.matches(regexCh2));

        //Tim's solution:
        String reEXp = "I want a \\w+.";
        System.out.println("Challenge #2 (Tim's solution 1):");
        System.out.println(challenge1.matches(reEXp));
        System.out.println(challenge2.matches(reEXp));
        String regExp1 = "I want a (bike|ball).";
        System.out.println("Challenge #2 (Tim's solution 2):");
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));


//==========================================
        //Challenge #3
        //In the last challenge, we used the same regular expression twice.
        //use the Matcher.matches() method to check for matches, instead of
        //String.matches(), for the regular expression that uses \w+.

        //Challenge #3 solution:
        System.out.println("\nChallenge #3:");
        Pattern patternCh3 = Pattern.compile("I want a \\w+.");
        Matcher matcherCh3 = patternCh3.matcher(challenge1);
        System.out.println(matcherCh3.matches());
        matcherCh3 = patternCh3.matcher(challenge2);
        System.out.println(matcherCh3.matches());


//==========================================
        //Challenge #4
        //Replace all occurrences of blank with an underscore for the following string.
        //Print out the resulting string.

        //Challenge #4 solution:
        System.out.println("\nChallenge #4:");
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));


//==========================================
        //Challenge #5
        //Write a regular expression that will match the following string in its entirety.
        //Use the String.matches() method to verify your answer.

        //Challenge #5 solution:
        System.out.println("\nChallenge #5:");
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("a{3}bc{8}d{3}ef{3}g"));
        System.out.println("Challenge #5 (Tim's solution):");
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));


//==========================================
        //Challenge #6
        //Write a regex that will only match the challenge 5 string in its entirety.

        //Challenge #6 solution:
        System.out.println("\nChallenge #6:");
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));


//==========================================
        //Challenge #7
        //Write a regex that will match a string that starts with a series of letters.
        //The letters must be followed by a period. After period, there must be a series of digits.
        //The string "kjisl.22" would match. The string "f5.12a" would not.
        //Use ths string to test your regex.

        //Challenge #7 solution:
        System.out.println("\nChallenge #7:");
        String ch7Regex = "\\w+\\.\\d+";
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches(ch7Regex));
        challenge7 = "kjisl.22";
        System.out.println(challenge7.matches(ch7Regex));
        challenge7 = "f5.12a";
        System.out.println(challenge7.matches(ch7Regex));

        System.out.println("Challenge #7: (Tim's solution):");
        ch7Regex = "^[A-z][a-z]+\\.\\d+$";
        challenge7 = "abcd.135";
        System.out.println(challenge7.matches(ch7Regex));
        challenge7 = "kjisl.22";
        System.out.println(challenge7.matches(ch7Regex));
        challenge7 = "f5.12a";
        System.out.println(challenge7.matches(ch7Regex));




    }
}
