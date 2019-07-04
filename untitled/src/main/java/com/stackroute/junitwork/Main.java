//7. Create a class with a main( ) that throws an object of class Exception inside a try block.
//a. Give the constructor for Exception a ​ String​ argument.
//b. Catch the exception inside a catch clause and print the ​ String​ argument.
//c. Add a finally clause and print a message to prove you were there
package com.stackroute.junitwork;

public class Main extends Exception{

    public Main(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try{

            throw new Main("exception occured in main method."); // exception
        }catch (Exception e){
            System.out.println(e);
        }
        finally {

            System.out.println("this is a finally block.");
        }
        System.out.println("this is after try-catch-finally block.");
    }
}
