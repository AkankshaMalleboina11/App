package com.example.appointment.service.dto;

import lombok.Data;

@Data
public class AppointmentBookingDTO {
    private String bookingId;
    private String patientId;
    private String locationName;     // from labcorp-service
    private String locationAddress;  // from labcorp-service (street, city, state zip)
    private String slotDate;         // yyyy-MM-dd
    private String slotTime;         // "9:00 AM"
}
