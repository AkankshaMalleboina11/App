package com.example.patient.service.controller;

import com.example.patient.service.entity.PatientAddress;
import com.example.patient.service.service.PatientAddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient-addresses")
public class PatientAddressController {

    private final PatientAddressService service;

    public PatientAddressController(PatientAddressService service) {
        this.service = service;
    }

    @GetMapping
    public List<PatientAddress> getAll() {
        return service.getAllAddresses();
    }

    @GetMapping("/{patientId}")
    public List<PatientAddress> getByPatientId(@PathVariable String patientId) {
        return service.getAddressesByPatientId(patientId);
    }
}
