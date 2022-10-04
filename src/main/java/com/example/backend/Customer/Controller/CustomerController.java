package com.example.backend.Customer.Controller;


import com.example.backend.Customer.Model.Customer;
import com.example.backend.Customer.Service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
