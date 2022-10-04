package com.example.backend.Acticity.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

//Nicolas

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer activityId;

    @Column(name="Type")
    private String type;

    @Column(name="Duration")
    private Integer duration;

    @Column(name="Maintenance")
    private Integer maintenance;

    @Column(name="Max Amount Of People")
    private Integer maxAmountOfPeople;

    @Column(name="Description")
    private String description;

    @Column(name="Picture")
    private String picture; //Path or URL.

    @Column(name="Price")
    private Integer price;

    @Column(name="Min age")
    private String minAge;

    @Column(name="Min Height")
    private String minHeight;

    @Column(name="Restrictions")
    private String restrictions;

    //Relation til Reservation


    public Activity(Integer activityId, String type, Integer duration, Integer maintenance, Integer maxAmountOfPeople, String description, String picture, Integer price, String minAge, String minHeight, String restrictions) {
        this.activityId = activityId;
        this.type = type;
        this.duration = duration;
        this.maintenance = maintenance;
        this.maxAmountOfPeople = maxAmountOfPeople;
        this.description = description;
        this.picture = picture;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.restrictions = restrictions;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", maintenance=" + maintenance +
                ", maxAmountOfPeople=" + maxAmountOfPeople +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                ", price=" + price +
                ", minAge='" + minAge + '\'' +
                ", minHeight='" + minHeight + '\'' +
                ", restrictions='" + restrictions + '\'' +
                '}';
    }
}