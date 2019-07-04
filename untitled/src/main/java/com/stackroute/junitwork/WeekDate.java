package com.stackroute.junitwork;
import java.util.Calendar;
import java.util.Date;
public class WeekDate {
    public Date firstDayOfWeek( Date date){
        // Get calendar set to current date and time

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    public Date lastDayOfWeek( Date date){
        Calendar calendar=Calendar.getInstance();
        // Set the calendar to monday of the current week
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        return calendar.getTime();
    }
}
