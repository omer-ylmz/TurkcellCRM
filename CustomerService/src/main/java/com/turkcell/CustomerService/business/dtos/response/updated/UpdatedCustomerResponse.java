package com.turkcell.CustomerService.business.dtos.response.updated;

import com.turkcell.CustomerService.entities.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedCustomerResponse {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private GenderType gender;
    private String fatherName;
    private String motherName;

}

