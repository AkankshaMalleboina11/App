package com.example.patient.service.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    private String id;

    private String name;

    private LocalDate dob;

    @Column(name = "phone_number")
    private String phone;

    private String email;

    private String gender;
}
