package com.example.labcorp.service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "location_availability")
@Data
public class LocationAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String locationId;
    private String availableSlot; // e.g., "10:00 AM"
    private String day;           // e.g., "Monday"
    private String slotStatus;    // e.g., "available", "booked"
}
