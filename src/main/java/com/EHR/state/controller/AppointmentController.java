package com.EHR.state.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EHR.state.dto.AppointmentRequest;
import com.EHR.state.dto.AppointmentStatusRequest;
import com.EHR.state.model.Appointment;
import com.EHR.state.service.AppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    
    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody AppointmentRequest request) {
        Appointment newAppointment = service.createAppointment(request);
        return newAppointment;
    }

    @PostMapping("/changeStatus")
    public Appointment changeAppointmentStatus(@RequestBody AppointmentStatusRequest request) {
        Appointment newAppointment = service.changeStatus(request);
        return newAppointment;
    }
    

}
