package com.stackroute.junitwork;

public class Exceptions {
//    public int arraytest(int[] arr) {
    public static void main(String[] args){
    String exp;

        //        NegativeArraySizeException
        try {
            int array[]=new int[-1];
//            int num[] = arr;
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }

//        IndexOutOfBoundsException
        try {
            int arr[]=new int[5];
//            int num[] = arr;
            arr[3] = 30;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

//        NullPointerException
        try {
            int arr[]=null;
//            int num[] = arr;
            int length = arr.length;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
//        return e;
    }
}

