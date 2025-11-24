package com.EHR.state.state.impl;

import org.springframework.stereotype.Component;

import com.EHR.state.model.Appointment;
import com.EHR.state.state.AppointmentState;

@Component("PENDING")
public class AppointmentPendingState implements AppointmentState{
    public void confirmed(Appointment appointment) {
        System.out.println("==== Confirming ====");
        appointment.setStatus("Confirmed");
    }

    public void cancelled(Appointment appointment) {
        System.out.println("==== cancelling ====");
        appointment.setStatus("Cancelled");
    }

    public void completed(Appointment appointment) {
        System.out.println("==== Not possible ====");
    }

    public void checkedIn(Appointment appointment) {
        System.out.println("==== Not possible ====");
    }
}
