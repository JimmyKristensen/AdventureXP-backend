package com.example.backend.Reservation.Controller;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Service.ReservationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nicolas, Ikke færdig
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/reservations")
public class ReservationController {

    private final ReservationService service;

    @GetMapping()
    public Iterable<Reservation> callApi(){
        return service.findAll();
    }
    public ReservationController(ReservationService service){
        this.service = service;
    }
}
