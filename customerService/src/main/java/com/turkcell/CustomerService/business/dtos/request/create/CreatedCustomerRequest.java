package com.turkcell.CustomerService.business.dtos.request.create;

import com.turkcell.CustomerService.entities.enums.GenderType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatedCustomerRequest {
    @NotNull
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    private GenderType gender;
    private String fatherName;
    private String motherName;
    @NotNull
    private String nationalityNo;




}
