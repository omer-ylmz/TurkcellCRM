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
@Table(name = "contact")
public class Contact extends BaseEntity<Integer> {
    @Column(name="email")
    private String email;

    @Column(name="mobilePhoneNumber")
    private String mobilePhoneNumber;

    @Column(name="homePhoneNumber")
    private String homePhoneNumber;

    @Column(name="faxNumber")
    private String faxNumber;

    @OneToOne
    private Customer customer;

}
