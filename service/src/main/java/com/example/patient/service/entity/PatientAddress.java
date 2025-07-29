package com.example.patient.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_addresses")
public class PatientAddress {

    @Id
    private String addressId;

    @Column(name = "patient_id")
    private String patientId;

    @Column(name = "address_type")
    private String type;  // home/work

    private String address;

    private String zipCode;

    private String state;

    private String city;

    private Double latitude;

    private Double longitude;
}
