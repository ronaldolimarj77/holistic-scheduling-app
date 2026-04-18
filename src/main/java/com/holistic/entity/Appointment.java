package com.holistic.entity;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private String clientName;
    private LocalDateTime appointmentTime;
    private String service;
    private String status;

    public Appointment() {}

    public Appointment(Long id, String clientName, LocalDateTime appointmentTime, String service, String status) {
        this.id = id;
        this.clientName = clientName;
        this.appointmentTime = appointmentTime;
        this.service = service;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}