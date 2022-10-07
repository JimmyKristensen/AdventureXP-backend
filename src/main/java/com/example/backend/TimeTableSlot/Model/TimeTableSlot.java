package com.example.backend.TimeTableSlot.Model;

import com.example.backend.Acticity.Model.Activity;
import com.example.backend.Reservation.Model.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="TimeTableSlot")
public class TimeTableSlot{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long timeTableSlotId;

    @Column(name="Date")
    private String dateOfTimeTableSlot;

    @Column(name="IsReserved")
    private Boolean isReserved;


    @OneToOne
    Activity activity;

    public TimeTableSlot(String dateOfTimeTableSlot, Activity activity) {
        this.dateOfTimeTableSlot = dateOfTimeTableSlot;
        this.activity = activity;

    }

    @Override
    public String toString() {
        return "TimeTableSlot{" +
                "timeTableSlotId=" + timeTableSlotId +
                ", dateOfTimeTableSlot='" + dateOfTimeTableSlot + '\'' +
                ", isReserved=" + isReserved +
                ", activity=" + activity +
                '}';
    }
}
