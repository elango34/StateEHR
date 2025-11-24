package com.EHR.state.state.impl;

import org.springframework.stereotype.Component;

import com.EHR.state.model.Appointment;
import com.EHR.state.state.AppointmentState;

@Component("CHECKED-IN")
public class AppointmentCheckedIn implements AppointmentState{
    public void confirmed(Appointment appointment) {
        System.out.println("==== Not Possible ====");
    }

    public void cancelled(Appointment appointment) {
        System.out.println("==== Not Possible ====");
    }

    public void completed(Appointment appointment) {
        System.out.println("==== Completing ====");
        appointment.setStatus("Completed");

    }

    public void checkedIn(Appointment appointment) {
        System.out.println("==== Not Possible ====");

    }
}
