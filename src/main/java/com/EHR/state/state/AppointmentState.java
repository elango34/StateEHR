package com.EHR.state.state;

import com.EHR.state.model.Appointment;

public interface AppointmentState {
    public void confirmed(Appointment appointment);
    public void cancelled(Appointment appointment);
    public void checkedIn(Appointment appointment);
    public void completed(Appointment appointment);
}
