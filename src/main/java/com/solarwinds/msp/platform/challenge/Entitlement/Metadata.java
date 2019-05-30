package com.solarwinds.msp.platform.challenge.Entitlement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    private Double availability;

    @JsonProperty("availability")
    public Double getAvailability() { return availability; }
    @JsonProperty("availability")
    public void setAvailability(Double value) { this.availability = value; }
}
