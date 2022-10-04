package com.example.backend.Customer.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

//Nicolas

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(name="Name")
    private String name;

    @Column(name="tlf")
    private Integer tlf;

    @Column(name="Email")
    private String email;

    public Customer(Integer customerId, String name, Integer tlf, String email) {
        this.customerId = customerId;
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