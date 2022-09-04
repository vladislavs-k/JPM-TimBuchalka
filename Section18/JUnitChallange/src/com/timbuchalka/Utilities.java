package com.timbuchalka;

public class Utilities {

    // Returns a char array containing every nth char. When
    // sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {

        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnLength = sourceArray.length / n;
        char[] result = new char[returnLength];
        int index = 0;

        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    // Remove pairs of the same character that are next
    // to each other, by removing on e occurrencd of the character.
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCBDEF" (the two B's aren't next to each other, so they
    // aren't removed.
    public String removePairs(String source) {

        if (source == null || source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        sb.append(string[0]);
        System.out.println(string[0]);
        for (int i = 1; i < string.length; i++) {
            System.out.println(string[i]);
            if (string[i] != string[i-1]) {
                sb.append(string[i]);
            }
        }

        return sb.toString();
    }

    // perform a conversion based on some internal
    // business rule.
    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }

        return null;
    }

}

