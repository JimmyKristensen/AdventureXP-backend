package com.example.backend.Reservation.Model;

import com.example.backend.Customer.Model.Customer;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

//Nicolas
@Getter
@NoArgsConstructor
@Entity
@Table(name="Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationId;


    @Column(name="Amount_Of_People")
    private long amountOfPeople;

    /* Jimmy */
    /* Many to one customer */

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @OneToOne
    TimeTableSlot timeTableSlot;

    public Reservation(long amountOfPeople, TimeTableSlot timeTableSlot, Customer customer) {
        this.amountOfPeople = amountOfPeople;
        this.timeTableSlot = timeTableSlot;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", amountOfPeople=" + amountOfPeople +
                ", customer=" + customer +
                ", timeTableSlot=" + timeTableSlot +
                '}';
    }
}
