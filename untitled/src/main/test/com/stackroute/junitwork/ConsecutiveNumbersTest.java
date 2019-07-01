package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers number;
    @Before
    public void setUp() throws Exception {
        number=new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }

    @Test
    public void checkConsecutiveFailure() {
        boolean expected=false;
        boolean actual=number.checkConsecutive("98,96,95,94,93");
        assertEquals(expected,actual);

    }

    @Test
    public void checkConsecutive() {
        boolean expected=true;
        boolean actual=number.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expected,actual);

    }

}