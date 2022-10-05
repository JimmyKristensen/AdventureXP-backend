package com.example.backend.TimeTableSlot.Service;

import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

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
}
