package com.EHR.state.state.impl;

import org.springframework.stereotype.Component;

import com.EHR.state.model.Appointment;
import com.EHR.state.state.AppointmentState;

@Component("CANCELLED")
public class AppointmentCancelled implements AppointmentState{
    public void confirmed(Appointment appointment) {
        System.out.println("==== Not Possible ====");
    }

    public void cancelled(Appointment appointment) {
        System.out.println("==== Already Cancelled ====");
    }

    public void completed(Appointment appointment) {
        System.out.println("==== Not possible ====");

    }

    public void checkedIn(Appointment appointment) {
        System.out.println("==== Checking In ====");
        appointment.setStatus("CheckedIn");
    }
}
