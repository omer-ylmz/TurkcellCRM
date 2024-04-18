package com.turkcell.CustomerService.core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;
    @Column(name = "updateDate")
    private LocalDateTime updatedDate;
    @Column(name = "deletedDate")
    private LocalDateTime deletedDate;
}
