package com.example.backend.TimeTableSlot.Controller;

import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import com.example.backend.TimeTableSlot.Service.TimeTableSlotService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
