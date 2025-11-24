package com.EHR.state.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.EHR.state.model.Appointment;

@Repository
public class AppointmentRepo {
    
    private final List<Appointment> appointments = new ArrayList<>();

    public boolean saveAppointment(Appointment appointment) {
        System.out.println("----- Saving to db -------");
        this.appointments.add(appointment);
        System.out.println(appointments);
        return true;
    }

    public Appointment findById(int id) {
        System.out.println("-- Finding by Id --");
        return this.appointments.stream()
                .filter(appointment -> appointment.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
