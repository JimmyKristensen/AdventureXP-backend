package com.example.backend.Reservation.Model;

import com.example.backend.Customer.Model.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

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

    @Column(name="Customer_Id")
    private long customerId;

    @Column(name="TimeTableSlot_ID")
    private long timeTableSlotID;

    @Column(name="Amount_Of_People")
    private long amountOfPeople;

    @OneToOne
    Customer customer;

    public Reservation(long customerId, long timeTableSlotID, long amountOfPeople,Customer customer) {
        this.customerId = customer.getCustomerId();
        this.timeTableSlotID = timeTableSlotID;
        this.amountOfPeople = amountOfPeople;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customerId=" + customerId +
                ", timeTableSlotID=" + timeTableSlotID +
                ", amountOfPeople=" + amountOfPeople +
                '}';
    }
}
