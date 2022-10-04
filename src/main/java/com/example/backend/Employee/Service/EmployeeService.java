package com.example.backend.Employee.Service;

import com.example.backend.Employee.Model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Timmie
 */

@Service
public class EmployeeService {

    private final CrudRepository<EmployeeModel,Long> repository;

    public EmployeeService(CrudRepository<EmployeeModel,Long> repository){this.repository = repository;}

    public Iterable<EmployeeModel> findAll(){
        return repository.findAll();
    }
}
