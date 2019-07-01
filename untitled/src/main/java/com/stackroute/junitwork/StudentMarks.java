package com.stackroute.junitwork;

public class StudentMarks {
    private int numOfStudents;
    private  int [] stuGrades;

    public StudentMarks(int numOfStudents, int[] stuGrades) {
        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;
    }

    public boolean checkGrades(){
        for (int element: stuGrades) {
            if(element < 0 || element >100){
                return false;
            }
        }
        return true;
    }
}
