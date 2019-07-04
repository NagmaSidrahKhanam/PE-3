package com.stackroute.junitwork;

public class StudentMarks {
    private int numOfStudents;
    private  int [] stuGrades;

    public StudentMarks(int numOfStudents, int[] stuGrades) {
        //parameterized constructor of class student marks
        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;
    }

    public boolean checkGrades(){
        //checking grades betweeen 0 and 100
        for (int element: stuGrades) {
            if(element < 0 || element >100){
                return false;
            }
        }
        return true;
    }
}
