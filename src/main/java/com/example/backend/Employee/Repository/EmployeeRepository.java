package com.example.backend.Employee.Repository;

import com.example.backend.Employee.Model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Timmie
 */

public interface EmployeeRepository extends CrudRepository<EmployeeModel,Long> {
}
