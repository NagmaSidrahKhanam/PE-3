package com.stackroute.junitwork;
import java.util.*;
import java.time.*;
import java.text.*;
public class Dates {

    public void FirstAndLastDates(){
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        DateFormat dateFormat = new SimpleDateFormat("EEE dd//MM/yyyy ");
        Date date = new Date();

        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println(Calendar.getInstance());
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println("res   "+df.format(dateFormat.format(date)));
        System.out.println();
    }
}
