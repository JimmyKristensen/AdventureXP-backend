package com.example.backend.Customer.Service;

import com.example.backend.Customer.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Nicolas, Ikke færdigt
 */
@Service
public class CustomerService {

    private final CrudRepository<Customer, Long> repository;

    public CustomerService(CrudRepository<Customer,Long> repository){this.repository = repository;}

    public Iterable<Customer> findAll(){return repository.findAll();}
}
