package com.stackroute.junitwork;

public class Matrix {
    private int [][] matrix1;
    private int [][] matrix2;
//program for addition odf the matrix
    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int [][] additionOfMatrices(){
        if(matrix1==null ||matrix2==null)
            return  null;
        int row=matrix1.length;
        //getting lenggth of the  rows
        int column=matrix1[0].length;
        //getting length of the matrix columns
        int [][] result=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return  result;
    }
}
