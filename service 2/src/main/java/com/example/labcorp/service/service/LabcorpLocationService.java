package com.example.labcorp.service.service;

import com.example.labcorp.service.entity.LabcorpLocation;
import com.example.labcorp.service.repository.LabcorpLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabcorpLocationService {

    @Autowired
    private LabcorpLocationRepository locationRepository;

    public List<LabcorpLocation> getAllLocations() {
        return locationRepository.findAll();
    }

    public LabcorpLocation getLocationById(String id) {
        return locationRepository.findById(id).orElse(null);
    }
}
