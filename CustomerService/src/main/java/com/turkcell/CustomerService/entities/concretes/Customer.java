package com.turkcell.CustomerService.entities.concretes;


import com.turkcell.CustomerService.core.entities.BaseEntity;
import com.turkcell.CustomerService.entities.enums.GenderType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="customers")
public class Customer extends BaseEntity<Integer> {

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "middlename")
    private String middleName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "birthdate")
    private LocalDate birthDate;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    @Column(name = "fathername")
    private String fatherName;
    @Column(name = "mothername")
    private String motherName;
    @Column(name = "nationalityId")
    private String nationalityNo;

    @OneToMany(mappedBy = "customer")
    private List<Address> address;

    @OneToOne(mappedBy = "customer")
    private Contact contact;






}
