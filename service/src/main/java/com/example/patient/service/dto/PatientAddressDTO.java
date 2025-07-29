package com.example.patient.service.dto;

import lombok.Data;

@Data
public class PatientAddressDTO {
    private String addressId;
    private String patientId;
    private String addressType;
    private String address;
    private String zipCode;
    private String state;
    private String city;
    private Double latitude;
    private Double longitude;
}
