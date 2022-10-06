package com.example.backend.Employee.Service;

import com.example.backend.Employee.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Timmie & Samuel
 */

@Service
public class EmployeeService {

    private final CrudRepository<Employee,Long> repository;

    public EmployeeService(CrudRepository<Employee,Long> repository){this.repository = repository;}

    public Iterable<Employee> findAll(){
        return repository.findAll();
    }

    //Crud Implementation For Employee
    public Employee create(Employee employee){
            return repository.save(employee);
    }

    public Optional<Employee> find(Long id){return repository.findById(id);}


    public Employee update(Long id, Employee employee){
        return repository.save(employee);
    }

    public Employee delete(Long id){
        repository.deleteById(id);
        return null;
    }
}
