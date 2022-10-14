package com.example.backend.Reservation.Controller;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Service.ReservationService;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Nicolas, Ikke færdig
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/reservations")
public class ReservationController {

    private final ReservationService service;
    private TimeTableSlot table;

    @GetMapping()
    public Iterable<Reservation> callApi(){
        return service.findAll();
    }
    public ReservationController(ReservationService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservation> find(@PathVariable("id") Long id){
        Optional<Reservation> reservation = Optional.of(service.find(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found.".formatted(id))));
        return ResponseEntity.ok().body(reservation.get());
    }

    @PostMapping
    public ResponseEntity<Reservation> create(@RequestBody Reservation reservation) {
        Reservation item = service.create(reservation);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservation> put(@PathVariable("id") Long id, @RequestBody Reservation reservation) {
        return ResponseEntity.ok().body(service.update(id, reservation));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Reservation> patch(@PathVariable("id") Long id, @RequestBody Reservation reservation) {
        return ResponseEntity.ok().body(service.update(id, reservation));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Reservation> delete(@PathVariable("id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Reservation not found.".formatted(id)));

        Reservation delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}
