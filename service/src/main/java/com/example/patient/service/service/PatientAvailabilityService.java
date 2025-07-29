package com.example.patient.service.service;

import com.example.patient.service.entity.PatientAvailability;
import com.example.patient.service.repository.PatientAvailabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientAvailabilityService {
    private final PatientAvailabilityRepository repository;

    public PatientAvailabilityService(PatientAvailabilityRepository repository) {
        this.repository = repository;
    }

    public List<PatientAvailability> getAllAvailabilities() {
        return repository.findAll();
    }

    public List<PatientAvailability> getByPatientId(String patientId) {
        return repository.findByPatientId(patientId);
    }
}
