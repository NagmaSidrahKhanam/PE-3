package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CountriesTest {
    Countries country;
    @Before
    public void setUp() throws Exception {
        country=new Countries();
    }

    @After
    public void tearDown() throws Exception {
        country=null;
    }

    @Test
    public void removeVowels() {
        String []input={
                "India",
                "United States" ,
                "Germany",
                "Egypt" ,
                "czechoslovakia"};
        String []expected={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals(expected,country.removeVowels(input));
    }
}