package com.example.appointment.service.service;

import com.example.appointment.service.dto.AppointmentBookingDTO;
import com.example.appointment.service.entity.AppointmentBooking;
import com.example.appointment.service.repository.AppointmentBookingRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentBookingService {

    private final AppointmentBookingRepository bookingRepository;
    private final RestTemplate http = new RestTemplate();

    public AppointmentBookingService(AppointmentBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<AppointmentBookingDTO> getSummariesByPatientId(String patientId) {
        List<AppointmentBooking> bookings = bookingRepository.findByPatientId(patientId);

        return bookings.stream().map(b -> {
            // Call labcorp-service to get location details
            LabcorpLocation loc = http.getForObject(
                    "http://localhost:8082/api/labcorp/locations/" + b.getLocationId(),
                    LabcorpLocation.class);

            AppointmentBookingDTO dto = new AppointmentBookingDTO();
            dto.setBookingId(b.getBookingId());
            dto.setPatientId(b.getPatientId());

            if (loc != null) {
                dto.setLocationName(loc.getLocationName());
                String fullAddress = loc.getAddress() + ", " + loc.getCity()
                        + ", " + loc.getState() + " " + loc.getZipCode();
                dto.setLocationAddress(fullAddress);
            } else {
                dto.setLocationName(null);
                dto.setLocationAddress(null);
            }

            dto.setSlotDate(b.getSlotDate() != null ? b.getSlotDate().toString() : null);
            dto.setSlotTime(b.getSlotTime());
            return dto;
        }).collect(Collectors.toList());
    }

    // Simple local DTO for the remote call (matches labcorp-service response)
    static class LabcorpLocation {
        private String locationId;
        private String locationName;
        private String address;
        private String zipCode;
        private String state;
        private String city;
        private Double latitude;
        private Double longitude;

        public String getLocationId() { return locationId; }
        public String getLocationName() { return locationName; }
        public String getAddress() { return address; }
        public String getZipCode() { return zipCode; }
        public String getState() { return state; }
        public String getCity() { return city; }
        public Double getLatitude() { return latitude; }
        public Double getLongitude() { return longitude; }
    }
}
