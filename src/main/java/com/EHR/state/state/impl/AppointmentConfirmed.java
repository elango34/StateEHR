package com.EHR.state.state.impl;

import org.springframework.stereotype.Component;

import com.EHR.state.model.Appointment;
import com.EHR.state.state.AppointmentState;

@Component("CONFIRMED")
public class AppointmentConfirmed implements AppointmentState {
    public void confirmed(Appointment appointment) {
        System.out.println("==== Already Confirmed ====");
        appointment.setStatus("Confirmed");
    }

    public void cancelled(Appointment appointment) {
        System.out.println("==== cancelling ====");
        appointment.setStatus("Cancelling");
    }

    public void completed(Appointment appointment) {
        System.out.println("==== Not possible ====");

    }

    public void checkedIn(Appointment appointment) {
        System.out.println("==== Confirming ====");
        appointment.setStatus("Checked-In");
    }
}
