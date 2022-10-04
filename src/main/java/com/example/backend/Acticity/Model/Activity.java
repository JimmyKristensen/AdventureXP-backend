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
    private String duration;

    @Column(name="Picture")
    private String picture; //Path or URL.

    @Column(name="Min Length")
    private String minLength;

    @Column(name="Min age")
    private String minAge;

    @Column(name="Max Pers")
    private Integer maxPers;

    @Column(name="Price")
    private Integer price;

    public Activity(Integer activityId, String type, String duration, String picture, String minLength, String minAge, Integer maxPers, Integer price) {
        this.activityId = activityId;
        this.type = type;
        this.duration = duration;
        this.picture = picture;
        this.minLength = minLength;
        this.minAge = minAge;
        this.maxPers = maxPers;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", type='" + type + '\'' +
                ", duration='" + duration + '\'' +
                ", picture='" + picture + '\'' +
                ", minLength='" + minLength + '\'' +
                ", minAge='" + minAge + '\'' +
                ", maxPers=" + maxPers +
                ", price=" + price +
                '}';
    }
}