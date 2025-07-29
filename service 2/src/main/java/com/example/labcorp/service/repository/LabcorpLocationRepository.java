package com.example.labcorp.service.repository;

import com.example.labcorp.service.entity.LabcorpLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabcorpLocationRepository extends JpaRepository<LabcorpLocation, String> {
}
