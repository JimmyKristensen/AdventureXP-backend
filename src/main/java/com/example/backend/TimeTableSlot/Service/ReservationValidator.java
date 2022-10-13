package com.example.backend.TimeTableSlot.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//SAMUEL

public class ReservationValidator {
    public ReservationValidator() {
        //Get Reservation               https://www.javaguides.net/2018/12/different-ways-to-retrieve-jpa-entity-objects-from-database.html
        LocalDateTime date = LocalDateTime.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int hour = date.getHour();
        int min = date.getMinute();
        LocalDateTime date1 = LocalDateTime.of(year,month,day,hour,min);

        String stringDate1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(date1);
        //Check database if date is taken               https://stackoverflow.com/questions/41958430/how-to-read-data-from-database-with-jpa-jpql-query-and-foreign-keys
        //Return true or false boolean
    }
    public LocalDate convertFromStrToDate(String strDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH);

        LocalDate date = LocalDate.parse(strDate,formatter);
        return date;
    }
}
