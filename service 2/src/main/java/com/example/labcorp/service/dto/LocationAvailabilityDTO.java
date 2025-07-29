package com.example.labcorp.service.dto;

import lombok.Data;

@Data
public class LocationAvailabilityDTO {
    private String id;
    private String locationId;
    private String day;
    private String timeSlot;
    private String status;
}
