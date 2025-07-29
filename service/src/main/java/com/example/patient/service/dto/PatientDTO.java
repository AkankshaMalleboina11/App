package com.example.patient.service.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PatientDTO {
    private String id;
    private String name;
    private LocalDate dob;
    private String phoneNumber;
    private String email;
    private String gender;
}
