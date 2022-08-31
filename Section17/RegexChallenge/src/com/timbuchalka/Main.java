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


//==========================================
        //Challenge #8
        //Modify the regex in challenge 7 to use a group, so that we can print all the digits
        //that occur in a string that contains multiple occurrences of the pattern. Write all the code
        //required to accomplish this (create a pattern and matcher, etc.). Use following string to
        //test your code:

        //Challenge #8 solution:
        System.out.println("\nChallenge #8:");
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String ch8GroupRegex = "\\w+\\.(\\d+)";
        Pattern ch8Pattern = Pattern.compile(ch8GroupRegex);
        Matcher ch8Matcher = ch8Pattern.matcher(challenge8);
        while (ch8Matcher.find()){
            System.out.println(ch8Matcher.group(1));
        }


//==========================================
        //Challenge #9
        //Let's suppose we're reading string that match the pattern we used in challenge 7 and 8
        //from a file. Tabs are used to separate the matches, with one exception. The last match is
        //followed by a newline. Our revised challenge 8 string would look k=like this:
        //Revise the regex accordingly and extract all the numbers, as we did in challenge 8

        //Challenge #9 solution:
        System.out.println("\nChallenge #9:");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        String ch9GroupRegex = "\\w+\\.(\\d+)[\\t|\\n]";
        Pattern ch9Pattern = Pattern.compile(ch9GroupRegex);
        Matcher ch9Matcher = ch9Pattern.matcher(challenge9);
        while (ch9Matcher.find()){
            System.out.println(ch9Matcher.group(1));
        }


//==========================================
        //Challenge #10
        //Instead of printing out the numbers themselves, print out their start and end
        //indices. Use the same string we used from challenge 9. Make those indices
        //inclusive. For example, the start index printed for 135 should be 5, and the end
        //index should be 7.

        //Challenge #10 solution:
        System.out.println("\nChallenge #10:");
        ch9Matcher.reset();
        while (ch9Matcher.find()){
            System.out.println("Start index: " + ch9Matcher.start(1) + " ; end index: " + (ch9Matcher.end(1) - 1) );
        }


//==========================================
        //Challenge #11
        //Suppose we have the following string containing points on a graph
        //within curly braces. Extract what's in the curly braces.

        //Challenge #11 solution:
        System.out.println("\nChallenge #11:");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
//        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";   //Check
        String ch11GroupRegex = "\\{(\\d+, \\d+)\\}";
//        String ch11GroupRegex = "\\{(.+?)\\}";    //Tim's solution
        Pattern ch11Pattern = Pattern.compile(ch11GroupRegex);
        Matcher ch11Matcher = ch11Pattern.matcher(challenge11);
        while (ch11Matcher.find()){
            System.out.println(ch11Matcher.group(1));
        }


//==========================================
        //Challenge #12
        //Write a regex that will match a 5-digit US zip code. Use "11111" as your test string.

        //Challenge #12 solution:
        System.out.println("\nChallenge #12:");
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));


//==========================================
        //Challenge #13
        //US zip codes can be followed by a dash and another fur numbers.
        //Write a regex that will match those zip codes.
        //Use "11111-1111" as your test string.

        //Challenge #13 solution:
        System.out.println("\nChallenge #13:");
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


//==========================================
        //Challenge #14
        //Write a regex that will match 5-digit US zip code, and zip codes
        //that contain the optional 4 digit preceded by a dash.

        //Challenge #14 solution:
        System.out.println("\nChallenge #14:");
//        String ch14Regex = "^\\d{5}$|^\\d{5}-\\d{4}$";
        String ch14Regex = "^\\d{5}(-\\d{4})?$"; //Tim's solution
        System.out.println(challenge12.matches(ch14Regex));
        System.out.println(challenge13.matches(ch14Regex));


    }
}

//S17: Section 17 completed!
