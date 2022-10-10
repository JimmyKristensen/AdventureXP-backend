package com.example.backend.Customer.Model;


import com.example.backend.Reservation.Model.Reservation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name="Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @Column(name="Name")
    private String name;

    @Column(name="tlf")
    private long tlf;

    @Column(name="Email")
    private String email;

    /* Jimmy */
    /* One to Many */
    @JsonBackReference
    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations;

    public Customer(String name, long tlf, String email) {
        this.name = name;
        this.tlf = tlf;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", tlf=" + tlf +
                ", email='" + email + '\'' +
                '}';
    }
}
