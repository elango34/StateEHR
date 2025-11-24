package com.EHR.state.state.impl;

import org.springframework.stereotype.Component;

import com.EHR.state.model.Appointment;
import com.EHR.state.state.AppointmentState;

@Component("COMPLETED")
public class AppointmentCompleted implements AppointmentState{
    public void confirmed(Appointment appointment) {
        System.out.println("==== Not Possible ====");
    }

    public void cancelled(Appointment appointment) {
        System.out.println("==== Not Possible ====");
    }

    public void completed(Appointment appointment) {
        System.out.println("==== Not possible ====");

    }

    public void checkedIn(Appointment appointment) {
        System.out.println("==== Not Possible ====");

    }
}
