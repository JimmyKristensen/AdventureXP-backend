package com.example.backend.Reservation.Service;

import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Reservation> find(Long id){
        return repository.findById(id);
    }

    public Reservation create(Reservation reservation){

        return repository.save(reservation);
    }

    public Reservation update(Long id, Reservation reservation){
        return repository.save(reservation);
    }

    public Reservation delete(long id){
        repository.deleteById(id);
        return null;
    }
}
