package com.example.backend.TimeTableSlot.Controller;

import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import com.example.backend.TimeTableSlot.Service.TimeTableSlotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Nicolas, Ikke færdig
 */
@CrossOrigin
@RestController
@RequestMapping("api/v1/TimeTableSlots")
public class TimeTableSlotController {

    private final TimeTableSlotService service;

    @GetMapping()
    public Iterable<TimeTableSlot> callApi(){
        return service.findAll();
    }

    public TimeTableSlotController(TimeTableSlotService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TimeTableSlot> find(@PathVariable("id") Long id){
        Optional<TimeTableSlot> timeTableSlot = Optional.of(service.find(id)
                .orElseThrow(() -> new RuntimeException("TimeTableSlot not found.".formatted(id))));
        return ResponseEntity.ok().body(timeTableSlot.get());
    }

    @PostMapping
    public ResponseEntity<TimeTableSlot> create(@RequestBody TimeTableSlot timeTableSlot) {
        TimeTableSlot item = service.create(timeTableSlot);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TimeTableSlot> put(@PathVariable("id") Long id, @RequestBody TimeTableSlot timeTableSlot) {
        return ResponseEntity.ok().body(service.update(id, timeTableSlot));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TimeTableSlot> patch(@PathVariable("id") Long id, @RequestBody TimeTableSlot timeTableSlot) {
        return ResponseEntity.ok().body(service.update(id, timeTableSlot));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TimeTableSlot> delete(@PathVariable("id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Reservation not found.".formatted(id)));

        TimeTableSlot delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}
