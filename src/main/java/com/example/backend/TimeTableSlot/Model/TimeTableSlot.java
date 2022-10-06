package com.example.backend.TimeTableSlot.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

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

    @Column(name="Time")
    private String timeOfTimeTableSlot;

    @Column(name="IsReserved")
    private Boolean isReserved = false;

    @Column(name="Activity_ID")
    private long activityId;

    public TimeTableSlot(String dateOfTimeTableSlot, String timeOfTimeTableSlot, long activityId) {
        this.dateOfTimeTableSlot = dateOfTimeTableSlot;
        this.timeOfTimeTableSlot = timeOfTimeTableSlot;
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return "TimeTableSlot{" +
                "timeTableSlotId=" + timeTableSlotId +
                ", dateOfTimeTableSlot='" + dateOfTimeTableSlot + '\'' +
                ", timeOfTimeTableSlot='" + timeOfTimeTableSlot + '\'' +
                ", isReserved=" + isReserved +
                ", activityId=" + activityId +
                '}';
    }
}
