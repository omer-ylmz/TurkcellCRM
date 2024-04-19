package com.turkcell.CustomerService.business.dtos.response.create;

import com.turkcell.CustomerService.entities.enums.GenderType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatedCustomerResponse {
    private int id;
    private LocalDateTime createdDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private GenderType gender;
    private String fatherName;
    private String motherName;
    private String nationalityNo;
}
