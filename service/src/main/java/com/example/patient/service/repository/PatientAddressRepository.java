package com.example.patient.service.repository;

import com.example.patient.service.entity.PatientAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientAddressRepository extends JpaRepository<PatientAddress, String> {
    List<PatientAddress> findByPatientId(String patientId);
}
