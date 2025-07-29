package com.example.labcorp.service.controller;

import com.example.labcorp.service.entity.LocationAvailability;
import com.example.labcorp.service.service.LocationAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/labcorp/availability")
public class LocationAvailabilityController {

    @Autowired
    private LocationAvailabilityService availabilityService;

    @GetMapping
    public List<LocationAvailability> getAllAvailabilities() {
        return availabilityService.getAllAvailabilities();
    }

    @GetMapping("/location/{locationId}")
    public List<LocationAvailability> getAvailabilityByLocationId(@PathVariable String locationId) {
        return availabilityService.getAvailabilityByLocationId(locationId);
    }
}
