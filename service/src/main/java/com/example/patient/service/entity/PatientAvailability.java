package com.example.patient.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_availability")
public class PatientAvailability {

    @Id
    private String id;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "preferred_slot")
    private String preferredSlot;
}
