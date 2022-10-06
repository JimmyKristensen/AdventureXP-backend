package com.example.backend.Customer.Controller;


import com.example.backend.Customer.Model.Customer;
import com.example.backend.Customer.Service.CustomerService;
import com.example.backend.Reservation.Model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Nicolas, Ikke færdigt
 */
@CrossOrigin
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService service;

    @GetMapping()
    public Iterable<Customer> callApi() {
        return service.findAll();
    }

    public CustomerController(CustomerService service){this.service = service;}

    @GetMapping("/{id}")
    public ResponseEntity<Customer> find(@PathVariable("id") Long id){
        Optional<Customer> customer = Optional.of(service.find(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found.".formatted(id))));
        return ResponseEntity.ok().body(customer.get());
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer item = service.create(customer);
        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> put(@PathVariable("id") Long id, @RequestBody Customer customer) {
        return ResponseEntity.ok().body(service.update(id, customer));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Customer> patch(@PathVariable("id") Long id, @RequestBody Customer customer) {
        return ResponseEntity.ok().body(service.update(id, customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable("id") Long id) {
        service.find(id).orElseThrow(() -> new RuntimeException("Reservation not found.".formatted(id)));

        Customer delete = service.delete(id);
        return ResponseEntity.ok().body(delete);
    }
}
