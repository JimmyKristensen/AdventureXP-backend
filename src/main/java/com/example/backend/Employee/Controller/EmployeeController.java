package com.example.backend.Employee.Controller;

import com.example.backend.Employee.Model.EmployeeModel;

import com.example.backend.Employee.Service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Timmie
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping()
    public Iterable<EmployeeModel> callApi(){
        return service.findAll();
    }
    public EmployeeController(EmployeeService service){this.service = service;}
}

