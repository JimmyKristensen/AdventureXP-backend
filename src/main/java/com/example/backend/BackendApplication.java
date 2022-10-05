package com.example.backend;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Acticity.Repository.ActivityRepository;
import com.example.backend.Customer.Model.Customer;
import com.example.backend.Customer.Repository.CustomerRepository;
import com.example.backend.Reservation.Model.Reservation;
import com.example.backend.Reservation.Repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner importData(CustomerRepository customerRepository,
                                        ActivityRepository activityRepository,
                                        ReservationRepository reservationRepository

    ){
        return (args) ->{

            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Nicolas",53341573,"nicolas.mousten@gmail.com"));
            customerRepository.saveAll(customers);

            final List<Activity> activities = new ArrayList<>();
            activities.add(new Activity("Go Cart",25,5,6,"BLABLABLA","PathToPic",499, "11 years", "150cm", "No prior injuries"));
            activityRepository.saveAll(activities);

            final List<Reservation> reservations = new ArrayList<>();
            reservations.add(new Reservation(1,1,6));
            reservationRepository.saveAll(reservations);
        };
    }
}
