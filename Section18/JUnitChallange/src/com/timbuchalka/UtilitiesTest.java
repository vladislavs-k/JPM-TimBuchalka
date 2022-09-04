package com.timbuchalka;


import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private Utilities utilities;

    @BeforeEach
    public void setup(){
        utilities = new Utilities();
    }

    @Test
    void everyNthChar() {
//        Utilities utilities = new Utilities();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] expect = {'e', 'l'};

        assertArrayEquals(expect, utilities.everyNthChar(input, 2));
    }

    @Test
    void everyNthChar_nGreaterThanArrayLength() {
//        Utilities utilities = new Utilities();
        char[] input = {'h', 'e', 'l', 'l', 'o'};

        assertArrayEquals(input, utilities.everyNthChar(input, 10));
    }

    @Test
    void removePairs() {
//        Utilities utilities = new Utilities();
//        String inputTestString = "AABCDDEFF";
//        String outputExpect = "ABCDEF";

        String inputTestString = "ABCCABDEEF";
        String outputExpect = "ABCABDEF";

        assertEquals(outputExpect, utilities.removePairs(inputTestString));
    }

    @Test
    void removePairs_Null() {
//        Utilities utilities = new Utilities();
        assertNull(utilities.removePairs(null), "null");
    }

    @Test
    void removePairs_lengthLessThan2() {
//        Utilities utilities = new Utilities();
        String inputTestString = "A";
        assertEquals(inputTestString, utilities.removePairs(inputTestString));
    }

    @Test
    void converter() {
//        Utilities utilities = new Utilities();

        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    void converter_exception() throws Exception {
        try {
//            Utilities utilities = new Utilities();

            utilities.converter(10, 0);
            fail("Should be thrown an ArithmeticException");
        } catch (ArithmeticException e){

        }

    }


    @Test
    void nullIfOddLength() {
//        Utilities utilities = new Utilities();
        String evenString = "even";
        String oddString = "odd";

        assertEquals(evenString, utilities.nullIfOddLength(evenString));
        assertNotNull(utilities.nullIfOddLength(evenString));
        assertNull(utilities.nullIfOddLength(oddString));
    }
}