package com.jetbanking.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDate {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");

    public String getDateNow(){
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }
}
