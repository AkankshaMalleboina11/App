package com.example.patient.service.service;

import com.example.patient.service.entity.PatientAddress;
import com.example.patient.service.repository.PatientAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientAddressService {
    private final PatientAddressRepository repository;

    public PatientAddressService(PatientAddressRepository repository) {
        this.repository = repository;
    }

    public List<PatientAddress> getAllAddresses() {
        return repository.findAll();
    }

    public List<PatientAddress> getAddressesByPatientId(String patientId) {
        return repository.findByPatientId(patientId);
    }
}
