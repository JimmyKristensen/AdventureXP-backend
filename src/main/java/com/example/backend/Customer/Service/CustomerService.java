package com.example.backend.Customer.Service;

import com.example.backend.Customer.Model.Customer;
import com.example.backend.Reservation.Model.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Nicolas, Ikke færdigt
 */
@Service
public class CustomerService {

    private final CrudRepository<Customer, Long> repository;

    public CustomerService(CrudRepository<Customer,Long> repository){this.repository = repository;}

    public Iterable<Customer> findAll(){return repository.findAll();}

    public Optional<Customer> find(Long id){
        return repository.findById(id);
    }

    public Customer create(Customer customer){
        return repository.save(customer);
    }

    public Customer update(Long id, Customer customer){
        return repository.save(customer);
    }

    public Customer delete(long id){
        repository.deleteById(id);
        return null;
    }
}
