package com.stackroute.junitwork;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class MatrixTest {
    private static Matrix matrixObj;
    @Before
    public void setUp() throws Exception {
        matrixObj=new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        matrixObj=null;
    }

    @Test
    public void additionOfMatrices() {
        matrixObj.setMatrix1(new int[][]{{1,2},{3,4},{5,6}});
        matrixObj.setMatrix2(new int[][]{{9,8},{7,6},{5,4}});
        int[][] actual=matrixObj.additionOfMatrices();

        assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},actual);

    }
    @Test
    public void additionOfMatricesNotNull() {
        matrixObj.setMatrix1(new int[][]{{1,2},{3,4},{5,6}});
        matrixObj.setMatrix2(new int[][]{{9,8},{7,6},{5,4}});
        int[][] actual=matrixObj.additionOfMatrices();

        assertNotNull(actual);

    }
    @Test
    public void additionOfMatricesNull() {
        int[][] actual=matrixObj.additionOfMatrices();
        assertNull(actual);

    }
}