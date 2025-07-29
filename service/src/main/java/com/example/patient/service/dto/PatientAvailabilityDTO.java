package com.example.patient.service.dto;

import lombok.Data;

@Data
public class PatientAvailabilityDTO {
    private String id;
    private String patientId;
    private String preferredSlot;
}
