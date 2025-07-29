package com.example.appointment.service.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "appointment_bookings")
public class AppointmentBooking {

    @Id
    @Column(name = "booking_id")
    private String bookingId;           // e.g., BK2025001

    @Column(name = "patient_id")
    private String patientId;           // e.g., PAT2025001

    @Column(name = "location_id")
    private String locationId;          // e.g., LOC2025001

    @Column(name = "slot_date")
    private LocalDate slotDate;         // 2025-08-01

    @Column(name = "slot_time")
    private String slotTime;            // "9:00 AM"
}
