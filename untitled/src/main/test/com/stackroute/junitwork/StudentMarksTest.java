package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentMarksTest {
    private static StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public void checkGrades() {
//        arrange
        studentMarks = new StudentMarks(5, new int[]{20,70, 80, 30, 60});
        boolean expected = true;
        boolean actual = studentMarks.checkGrades();

        assertEquals(expected, actual);
    }

    @Test
    public void checkGradesFailure() {
//        arrange
        studentMarks = new StudentMarks(3, new int[]{40, 90, 105});
        boolean expected = false;
        boolean actual = studentMarks.checkGrades();

        assertEquals(expected, actual);
    }
    public void checkGradesPass() {
//        arrange
        studentMarks = new StudentMarks(4, new int[]{-20, 60, 40,50, 150});
        boolean expected = false;
        boolean actual = studentMarks.checkGrades();

        assertEquals(expected, actual);
    }
}