package com.example.backend.Reservation.Service;

import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Nicolas, Ikke færdig
 */
@Service
public class ReservationService {
    private final CrudRepository<Reservation, Long> repository;

    public ReservationService(CrudRepository<Reservation, Long> repository){
        this.repository = repository;
    }

    public Iterable<Reservation> findAll(){
        return repository.findAll();
    }
}
