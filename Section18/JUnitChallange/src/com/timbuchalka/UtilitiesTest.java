package com.timbuchalka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void everyNthChar() {
        fail("There is no test's implementation");
    }

    @Test
    void removePairs() {
        Utilities utilities = new Utilities();
//        String inputTestString = "AABCDDEFF";
//        String outputExpect = "ABCDEF";

        String inputTestString = "ABCCABDEEF";
        String outputExpect = "ABCABDEF";

        assertEquals(outputExpect, utilities.removePairs(inputTestString));
    }

    @Test
    void converter() {
        fail("There is no test's implementation");
    }

    @Test
    void nullIfOddLength() {
        fail("There is no test's implementation");
    }
}