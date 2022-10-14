package com.example.backend.Acticity.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

//Nicolas
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long activityId;

    @Column(name="Type")
    private String typeOfActivity;

    @Column(name="Duration")
    private long durationOfActivity;

    @Column(name="Maintenance")
    private long maintenanceOfActivity;

    @Column(name="Max_Amount_Of_People")
    private long maxAmountOfPeople;

    @Column(name="Description")
    private String descriptionOfActivity;

    @Column(name="Picture")
    private String pictureOfActivity; //Path or URL.

    @Column(name="Price")
    private long priceOfActivity;

    @Column(name="Min_age")
    private String minAge;

    @Column(name="Min_Height")
    private String minHeight;

    @Column(name="Restrictions")
    private String restrictionsOfActivity;

    //Relation til Reservation


    public Activity(String typeOfActivity, long durationOfActivity, long maintenanceOfActivity, long maxAmountOfPeople, String descriptionOfActivity, String pictureOfActivity, long priceOfActivity, String minAge, String minHeight, String restrictionsOfActivity) {
        this.typeOfActivity = typeOfActivity;
        this.durationOfActivity = durationOfActivity;
        this.maintenanceOfActivity = maintenanceOfActivity;
        this.maxAmountOfPeople = maxAmountOfPeople;
        this.descriptionOfActivity = descriptionOfActivity;
        this.pictureOfActivity = pictureOfActivity;
        this.priceOfActivity = priceOfActivity;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.restrictionsOfActivity = restrictionsOfActivity;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", typeOfActivity='" + typeOfActivity + '\'' +
                ", durationOfActivity=" + durationOfActivity +
                ", maintenanceOfActivity=" + maintenanceOfActivity +
                ", maxAmountOfPeople=" + maxAmountOfPeople +
                ", descriptionOfActivity='" + descriptionOfActivity + '\'' +
                ", pictureOfActivity='" + pictureOfActivity + '\'' +
                ", priceOfActivity=" + priceOfActivity +
                ", minAge='" + minAge + '\'' +
                ", minHeight='" + minHeight + '\'' +
                ", restrictionsOfActivity='" + restrictionsOfActivity + '\'' +
                '}';
    }

    public long getTotalTimeOfActivity() { //1310 2022 hans: added so we can use the total time of the activity for date validation
        //purposes.
        return this.durationOfActivity + this.maintenanceOfActivity;
    }
}