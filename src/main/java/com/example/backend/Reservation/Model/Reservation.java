package com.example.backend.Reservation.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

//Nicolas

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    @Column(name="Customer Id")
    private Integer customerId;

    @Column(name="TimeTableSlot ID")
    private Integer timeTableSlotID;

    @Column(name="Amount Of People")
    private Integer amountOfPeople;

    public Reservation(Integer reservationId, Integer customerId, Integer timeTableSlotID, Integer amountOfPeople) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.timeTableSlotID = timeTableSlotID;
        this.amountOfPeople = amountOfPeople;
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