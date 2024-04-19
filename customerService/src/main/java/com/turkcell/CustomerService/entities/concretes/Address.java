package com.turkcell.CustomerService.entities.concretes;

import com.turkcell.CustomerService.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "adresses")
public class Address extends BaseEntity<Integer> {
    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "houseFlatNumber")
    private String houseFlatNumber;

    @Column(name = "addressDescription")
    private String addressDescription;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
