package com.patnox.labs.chai;

import java.io.Serializable;
import java.util.Random;

// @Table
// @Entity
public class ChaiEIDResultObject implements Serializable {

    private Long id;
    private String order_number = "839122";
    private String sample_status = "Complete";
    private String provider_identifier = "KNH";
    private String result = "Negative";
    private String date_received = "2018-03-09";
    private String date_tested = "2018-04-01";
    private String date_collected = "2018-02-06";
    private String date_dispatched = "2018-04-05";
    private Integer facility_code = 10263;
    private String AMRs_location = "Here";
    private String full_names = "John Doe";
    private String interpretation = "Very Sick";
    private String patient = "10263-kccc";

    public ChaiEIDResultObject() {
    }

    public ChaiEIDResultObject(String order_number, String sample_status, String provider_identifier, String result,
            String date_received, String date_tested, String date_collected, String date_dispatched,
            Integer facility_code, String aMRs_location, String full_names, String interpretation, String patient) {
        this.id = getRadId();
        this.order_number = order_number;
        this.sample_status = sample_status;
        this.provider_identifier = provider_identifier;
        this.result = result;
        this.date_received = date_received;
        this.date_tested = date_tested;
        this.date_collected = date_collected;
        this.date_dispatched = date_dispatched;
        this.facility_code = facility_code;
        this.AMRs_location = aMRs_location;
        this.full_names = full_names;
        this.interpretation = interpretation;
        this.patient = patient;
    }

    private Long getRadId() {
        Long ret = 0L;
        Random r = new Random();
        int low = 10;
        int high = 999999999;
        ret = (long) r.nextInt(high-low) + low;
        return(ret);
    }

    public void genID() {
        this.id = getRadId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getSample_status() {
        return sample_status;
    }

    public void setSample_status(String sample_status) {
        this.sample_status = sample_status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProvider_identifier() {
        return provider_identifier;
    }

    public void setProvider_identifier(String provider_identifier) {
        this.provider_identifier = provider_identifier;
    }

    public String getDate_received() {
        return date_received;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public String getDate_tested() {
        return date_tested;
    }

    public void setDate_tested(String date_tested) {
        this.date_tested = date_tested;
    }

    public String getDate_collected() {
        return date_collected;
    }

    public void setDate_collected(String date_collected) {
        this.date_collected = date_collected;
    }

    public String getDate_dispatched() {
        return date_dispatched;
    }

    public void setDate_dispatched(String date_dispatched) {
        this.date_dispatched = date_dispatched;
    }

    public Integer getFacility_code() {
        return facility_code;
    }

    public void setFacility_code(Integer facility_code) {
        this.facility_code = facility_code;
    }

    public String getAMRs_location() {
        return AMRs_location;
    }

    public void setAMRs_location(String aMRs_location) {
        AMRs_location = aMRs_location;
    }

    public String getFull_names() {
        return full_names;
    }

    public void setFull_names(String full_names) {
        this.full_names = full_names;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    
    
}
