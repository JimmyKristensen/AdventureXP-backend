package com.example.backend.Reservation.Repository;

import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
