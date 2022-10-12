package com.example.backend.Reservation.Service;

import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;
//SAMUEL

public class ReservationValidator {
    public ReservationValidator() {
        //Get Reservation
        //Check database if date is taken
        //Return true or false boolean
    }
    public LocalDate convertFromStrToDate(String strDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH);
        LocalDate date = LocalDate.parse(strDate,formatter);
        return date;
    }
}
