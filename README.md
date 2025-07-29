# App

Overview
This project implements a Patient Appointment Scheduling System using Spring Boot Microservices architecture and a PostgreSQL database.

Patients can book appointments at the nearest LabCorp location within a 5–15 mile radius based on their availability.

🗂️ Services
Patient Service (port: 8081)

Manages patients, addresses, and availability.

Endpoints:
GET /api/patients – List all patients
GET /api/patients/{id} – Get patient details by ID
LabCorp Service (port: 8082)
Manages LabCorp locations and slot availability.

Endpoints:
GET /api/labcorp/locations – List all locations
GET /api/labcorp/locations/{id} – Get location by ID
Appointment Service (port: 8083)
Manages appointment bookings.

Endpoints:
GET /api/appointments – List all appointments
GET /api/appointments/{bookingId} – Get appointment by booking ID
