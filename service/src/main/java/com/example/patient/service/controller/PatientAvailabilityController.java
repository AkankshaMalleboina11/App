package com.example.patient.service.controller;

import com.example.patient.service.entity.PatientAvailability;
import com.example.patient.service.service.PatientAvailabilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient-availability")
public class PatientAvailabilityController {

    private final PatientAvailabilityService service;

    public PatientAvailabilityController(PatientAvailabilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<PatientAvailability> getAll() {
        return service.getAllAvailabilities();
    }

    @GetMapping("/{patientId}")
    public List<PatientAvailability> getByPatientId(@PathVariable String patientId) {
        return service.getByPatientId(patientId);
    }
}
