package com.example.backend.TimeTableSlot.Service;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Service.ReservationValidator;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Nicolas, Ikke Færdig
 */
@Service
public class TimeTableSlotService {

    private final CrudRepository<TimeTableSlot, Long> repository;

    public TimeTableSlotService(CrudRepository<TimeTableSlot, Long> repository){
        this.repository = repository;
    }

    public Iterable<TimeTableSlot> findAll(){
        return repository.findAll();
    }

    public Optional<TimeTableSlot> find(Long id){
        return repository.findById(id);
    }
//samuel
    public TimeTableSlot create(TimeTableSlot timeTableSlot){
        ReservationValidator validator = new ReservationValidator();
        String convertedDate = validator.convertFromStrToDate(timeTableSlot.getDateOfTimeTableSlot()).toString();
        timeTableSlot.setDateOfTimeTableSlot(convertedDate);
        return repository.save(timeTableSlot);
    }

    public TimeTableSlot update(Long id, TimeTableSlot timeTableSlot){
        return repository.save(timeTableSlot);
    }

    public TimeTableSlot delete(long id){
        repository.deleteById(id);
        return null;
    }
}
