package com.timbuchalka;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utilities;

    private String input;
    private String expect;

    public UtilitiesTestParameterized(String input, String expect) {
        this.input = input;
        this.expect = expect;
    }

    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
            {"ABCDEFF", "ABCDEF"},
            {"AB88EFFG", "AB8EFG"},
            {"112233445566", "123456"},
            {"A", "A"}
        });
    }

    @Test
    public void removePairs() throws Exception{
        assertEquals(expect, utilities.removePairs(input));
    }


}
