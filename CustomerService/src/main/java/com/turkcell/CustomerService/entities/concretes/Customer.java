package com.turkcell.CustomerService.entities.concretes;


import com.turkcell.CustomerService.core.entities.BaseEntity;
import com.turkcell.CustomerService.entities.enums.GenderType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="customers")
public class Customer extends BaseEntity {

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "middlename")
    private String middleName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "birthdate")
    private LocalDate birthDate;
    @Column(name = "gender")
    private GenderType gender;  //TODO: KONUSULACAK
    @Column(name = "fathername")
    private String fatherName;
    @Column(name = "mothername")
    private String motherName;

    @Column(name = "nationalityId")
    private String nationalityNo;





}
