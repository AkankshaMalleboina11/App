package com.example.labcorp.service.controller;

import com.example.labcorp.service.entity.LabcorpLocation;
import com.example.labcorp.service.service.LabcorpLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/labcorp/locations")
public class LabcorpLocationController {

    @Autowired
    private LabcorpLocationService locationService;

    @GetMapping
    public List<LabcorpLocation> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public LabcorpLocation getLocationById(@PathVariable String id) {
        return locationService.getLocationById(id);
    }
}
