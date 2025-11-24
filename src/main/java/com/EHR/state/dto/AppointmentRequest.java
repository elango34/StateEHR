package com.EHR.state.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentRequest {
    private String patientName;
    private String status;
    private String providerName;
    private int duration;
}
