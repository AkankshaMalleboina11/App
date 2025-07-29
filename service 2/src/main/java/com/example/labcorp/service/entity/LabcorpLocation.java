package com.example.labcorp.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "labcorp_locations")
@Data
public class LabcorpLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String locationId;

    private String locationName;
    private String address;
    private String zipCode;
    private String state;
    private String city;
    private Double latitude;
    private Double longitude;
}
