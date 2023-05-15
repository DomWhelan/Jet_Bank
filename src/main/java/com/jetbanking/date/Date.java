package com.jetbanking.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Date {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");

    public String getDateNow(){
        return SimpleDateFormat.getDateInstance().format(dateFormat);
    }
}
