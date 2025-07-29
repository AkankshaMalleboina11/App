package com.example.labcorp.service.service;

import com.example.labcorp.service.entity.LocationAvailability;
import com.example.labcorp.service.repository.LocationAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationAvailabilityService {

    @Autowired
    private LocationAvailabilityRepository availabilityRepository;

    public List<LocationAvailability> getAllAvailabilities() {
        return availabilityRepository.findAll();
    }

    public List<LocationAvailability> getAvailabilityByLocationId(String locationId) {
        return availabilityRepository.findByLocationId(locationId);
    }
}
