package com.example.backend.Employee.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Timmie & Samuel
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //Used to Update Crud For Employee
    public Employee updateFrom(Employee employee, boolean partial){
        if(!partial || employee.name != null){this.name = employee.name;}
        if(!partial || employee.password != null){this.password = employee.password;}
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
