package com.example.backend;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Acticity.Repository.ActivityRepository;
import com.example.backend.Customer.Model.Customer;
import com.example.backend.Customer.Repository.CustomerRepository;
import com.example.backend.Employee.Model.Employee;
import com.example.backend.Employee.Repository.EmployeeRepository;
import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Repository.ReservationRepository;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import com.example.backend.TimeTableSlot.Repository.TimeTableSlotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.*;
import java.util.List;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
    /*
    @Bean
    public CommandLineRunner importData(CustomerRepository customerRepository,
                                        ActivityRepository activityRepository,
                                        ReservationRepository reservationRepository,
                                        EmployeeRepository employeeRepository,
                                        TimeTableSlotRepository timeTableSlotRepository

    ){
        return (args) ->{

            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Nicolas",53341573,"nicolas.mousten@gmail.com"));
            customers.add(new Customer("Jimmy",72838295,"jimmysupercool@ukmail.com"));
            customers.add(new Customer("Hans",11223344,"hans@ukmail.com"));
            customerRepository.saveAll(customers);

            final List<Activity> activities = new ArrayList<>();
            activities.add(new Activity("Go Cart",25,5,6,"BLABLABLA","PathToPic",499, "11 years", "150cm", "No prior injuries"));
            activities.add(new Activity("Go Cart electric boogaloo",25,5,6,"BLABLABLA","PathToPic",499, "11 years", "150cm", "No prior injuries"));
            activityRepository.saveAll(activities);

            final List<TimeTableSlot> timeTableSlots = new ArrayList<>();
            timeTableSlots.add(new TimeTableSlot("1987-08/01 18:30",activities.get(0)));
            timeTableSlots.add(new TimeTableSlot("1987-09/02 18:30",activities.get(0)));
            timeTableSlots.add(new TimeTableSlot("1987-08/03 18:30",activities.get(0)));
            timeTableSlotRepository.saveAll(timeTableSlots);

            final List<Reservation> reservations = new ArrayList<>();
            reservations.add(new Reservation(8,timeTableSlots.get(0), customers.get(0)));
            reservations.add(new Reservation(2,timeTableSlots.get(1), customers.get(1)));
            reservationRepository.saveAll(reservations);

            final List<Employee> employee = new ArrayList<>();
            employee.add(new Employee("admin","funnyPass123"));
            employeeRepository.saveAll(employee);


        };
    }

     */
}
