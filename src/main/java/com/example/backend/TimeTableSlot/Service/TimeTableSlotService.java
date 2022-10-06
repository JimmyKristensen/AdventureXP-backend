package com.example.backend.TimeTableSlot.Service;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

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

    public TimeTableSlot create(TimeTableSlot timeTableSlot){
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
