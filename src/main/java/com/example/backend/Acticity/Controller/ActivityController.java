package com.example.backend.Acticity.Controller;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Acticity.Service.ActivityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
