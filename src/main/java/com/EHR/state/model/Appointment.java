package com.EHR.state.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Appointment {
    private int id;
    private String patientName;
    private String status;
    private String providerName;
    private int duration;
}
