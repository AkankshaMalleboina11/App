package com.example.patient.service.service;

import com.example.patient.service.entity.Patient;
import com.example.patient.service.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Patient getPatientById(String id) {
        return repository.findById(id).orElse(null);
    }
}
