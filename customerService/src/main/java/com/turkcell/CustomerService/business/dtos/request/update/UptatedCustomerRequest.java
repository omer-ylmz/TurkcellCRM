package com.turkcell.CustomerService.business.dtos.request.update;

import com.turkcell.CustomerService.entities.enums.GenderType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UptatedCustomerRequest {
    @NotNull
    private int id;
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
}
