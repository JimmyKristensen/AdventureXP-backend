package com.example.backend.Employee.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Timmie
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String password;

    public EmployeeModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
