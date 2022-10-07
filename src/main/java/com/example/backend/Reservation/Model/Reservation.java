package com.example.backend.Reservation.Model;

import com.example.backend.Customer.Model.Customer;
import com.example.backend.TimeTableSlot.Model.TimeTableSlot;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

//Nicolas
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationId;


    @Column(name="Amount_Of_People")
    private long amountOfPeople;

    @OneToOne
    Customer customer;

    @OneToOne
    TimeTableSlot timeTableSlot;

    public Reservation(long amountOfPeople,Customer customer, TimeTableSlot time) {
        this.amountOfPeople = amountOfPeople;
        this.customer = customer;
        this.timeTableSlot = time;
        time.setIsReserved(true);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", amountOfPeople=" + amountOfPeople +
                ", customer=" + customer +
                '}';
    }
}
