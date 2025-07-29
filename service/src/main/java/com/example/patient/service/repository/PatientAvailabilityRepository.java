package com.example.patient.service.repository;

import com.example.patient.service.entity.PatientAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientAvailabilityRepository extends JpaRepository<PatientAvailability, String> {
    List<PatientAvailability> findByPatientId(String patientId);
}
