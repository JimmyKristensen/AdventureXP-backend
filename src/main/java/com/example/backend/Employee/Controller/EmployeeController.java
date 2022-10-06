package com.example.backend.Employee.Controller;

import com.example.backend.Employee.Model.Employee;

import com.example.backend.Employee.Service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import javax.validation.Valid;

/**
 * Timmie & Samuel
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping()
    public Iterable<Employee> callApi(){
        return service.findAll();
    }
    public EmployeeController(EmployeeService service){this.service = service;}

    @GetMapping("/{id}")
    public ResponseEntity<Employee> find(@PathVariable("id") Long id){
        Optional<Employee> item = Optional.of(service.find(id)
                .orElseThrow(() -> new RuntimeException("User %d not found.".formatted(id))));
        return ResponseEntity.ok().body(item.get());
    }
    @PostMapping
    public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee){
        Employee item = service.create(employee);
        return ResponseEntity.ok().body(item);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Employee> patch(@PathVariable("id") Long id, @Valid @RequestBody Employee employee){
        return ResponseEntity.ok().body(service.update(id,employee));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete(@PathVariable("id") Long id){
        service.find(id).orElseThrow(() -> new RuntimeException("Product %d not found".formatted(id)));

        Employee delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}

