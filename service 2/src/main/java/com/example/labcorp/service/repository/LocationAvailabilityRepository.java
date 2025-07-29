package com.example.labcorp.service.repository;

import com.example.labcorp.service.entity.LocationAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationAvailabilityRepository extends JpaRepository<LocationAvailability, String> {
    List<LocationAvailability> findByLocationId(String locationId);
}
