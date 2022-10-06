package com.example.backend.Employee.Repository;

import com.example.backend.Employee.Model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Timmie & Samuel
 */

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
