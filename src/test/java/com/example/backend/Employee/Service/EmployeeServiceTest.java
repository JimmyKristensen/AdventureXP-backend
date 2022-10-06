package com.example.backend.Employee.Service;

import com.example.backend.Employee.Model.Employee;
import com.example.backend.Employee.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

class EmployeeServiceTest {



    @Test
    void create() {
        final CrudRepository<Employee,Long> repository;

        Employee test1 = new Employee("Nicolas","Nico");



    }
}