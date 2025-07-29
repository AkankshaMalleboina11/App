package com.example.appointment.service.repository;

import com.example.appointment.service.entity.AppointmentBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentBookingRepository extends JpaRepository<AppointmentBooking, String> {
    List<AppointmentBooking> findByPatientId(String patientId);
}
