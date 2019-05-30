package com.solarwinds.msp.platform.challenge.Entitlement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entitlement {
    private String createdAt;
    private long entitlementID;
    private Metadata metadata;
    private Service service;
    private Object updatedAt;

    @JsonProperty("created_at")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(String value) { this.createdAt = value; }

    @JsonProperty("entitlement_id")
    public long getEntitlementID() { return entitlementID; }
    @JsonProperty("entitlement_id")
    public void setEntitlementID(long value) { this.entitlementID = value; }

    @JsonProperty("metadata")
    public Metadata getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(Metadata value) { this.metadata = value; }

    @JsonProperty("service")
    public Service getService() { return service; }
    @JsonProperty("service")
    public void setService(Service value) { this.service = value; }

    @JsonProperty("updated_at")
    public Object getUpdatedAt() { return updatedAt; }
    @JsonProperty("updated_at")
    public void setUpdatedAt(Object value) { this.updatedAt = value; }
}
