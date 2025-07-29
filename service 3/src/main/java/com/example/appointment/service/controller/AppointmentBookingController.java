package com.example.appointment.service.controller;

import com.example.appointment.service.dto.AppointmentBookingDTO;
import com.example.appointment.service.dto.AppointmentBookingDTO;
import com.example.appointment.service.service.AppointmentBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentBookingController {

    private final AppointmentBookingService bookingService;

    public AppointmentBookingController(AppointmentBookingService bookingService) {
        this.bookingService = bookingService;
    }

    // GET /api/appointments/patient/PAT2025001
    @GetMapping("/patient/{patientId}")
    public List<AppointmentBookingDTO> getByPatientId(@PathVariable String patientId) {
        return bookingService.getSummariesByPatientId(patientId);
    }
}
