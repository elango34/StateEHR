package com.EHR.state.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.EHR.state.dto.AppointmentRequest;
import com.EHR.state.dto.AppointmentStatusRequest;
import com.EHR.state.model.Appointment;
import com.EHR.state.repo.AppointmentRepo;
import com.EHR.state.state.AppointmentState;

@Service
public class AppointmentService {
    // logics and saving data
 
    private AppointmentRepo repo;
    private final Map<String, AppointmentState> appointmentState;

    public AppointmentService(AppointmentRepo repo, Map<String, AppointmentState> appointmentState) {
        this.repo = repo;
        this.appointmentState = appointmentState;
    }


    public Appointment createAppointment(AppointmentRequest request) {
        Appointment newAppointment = Appointment.builder()
                                        .id(123)
                                        .patientName(request.getPatientName())
                                        .providerName(request.getProviderName())
                                        .status(request.getStatus())
                                        .duration(request.getDuration())
                                        .build();

        // save to db
        repo.saveAppointment(newAppointment);
        return newAppointment;
    }

    public Appointment changeStatus(AppointmentStatusRequest request) {
        
        // get the appointment by using id
        Appointment appointment = repo.findById(request.getId());

        System.out.println(appointment);

        // get the correct 
        // now give the appointment to change the status
        AppointmentState appointmentState = this.appointmentState.get(request.getStatus());

        appointmentState.confirmed(appointment);

        return appointment;

    }
}
