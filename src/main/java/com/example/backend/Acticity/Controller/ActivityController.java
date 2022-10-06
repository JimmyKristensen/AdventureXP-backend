package com.example.backend.Acticity.Controller;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Acticity.Service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Nicolas, ikke færdigt
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/activities")
public class ActivityController {

    private final ActivityService service;

    @GetMapping()
    public Iterable<Activity> callApi(){
        return service.findAll();
    }

    public ActivityController(ActivityService service){
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activity> find(@PathVariable("id") Long id){
        Optional<Activity> activity = Optional.of(service.find(id)
                .orElseThrow(() -> new RuntimeException("Activity not found.".formatted(id))));
        return ResponseEntity.ok().body(activity.get());
    }
    @PostMapping
    public ResponseEntity<Activity> create(@RequestBody Activity activity) {
        Activity item = service.create(activity);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Activity> put(@PathVariable("id") Long id, @RequestBody Activity activity) {
        return ResponseEntity.ok().body(service.update(id, activity));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Activity> patch(@PathVariable("id") Long id, @RequestBody Activity activity) {
        return ResponseEntity.ok().body(service.update(id, activity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Activity> delete(@PathVariable("id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Activity not found.".formatted(id)));

        Activity delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }





}
