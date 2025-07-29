package com.example.labcorp.service.dto;

import lombok.Data;

@Data
public class LabcorpLocationDTO {
    private String locationId;
    private String locationName;
    private String address;
    private String zipCode;
    private String state;
    private String city;
    private double latitude;
    private double longitude;
}
