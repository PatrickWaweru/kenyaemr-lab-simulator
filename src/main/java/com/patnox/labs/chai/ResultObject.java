package com.patnox.labs.chai;

import java.io.Serializable;
import java.util.Random;

// @Table
// @Entity
public class ResultObject implements Serializable {

    private Long id;
    private String order_number;
    private String sample_status;
    private String lab_no;
    private String result;
    private dateObject date_received;
    private dateObject date_tested;

    public ResultObject() {
    }

    public ResultObject(String order_number, String sample_status, String lab_no, String result, dateObject date_received, dateObject date_tested) {
        this.id = getRadId();
        this.order_number = order_number;
        this.sample_status = sample_status;
        this.lab_no = lab_no;
        this.result = result;
        this.date_received = date_received;
        this.date_tested = date_tested;
    }

    private Long getRadId() {
        Long ret = 0L;
        Random r = new Random();
        int low = 10;
        int high = 999999999;
        ret = (long) r.nextInt(high-low) + low;
        return(ret);
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

    public String getLab_no() {
        return lab_no;
    }

    public void setLab_no(String lab_no) {
        this.lab_no = lab_no;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public dateObject getDate_received() {
        return date_received;
    }

    public void setDate_received(dateObject date_received) {
        this.date_received = date_received;
    }

    public dateObject getDate_tested() {
        return date_tested;
    }

    public void setDate_tested(dateObject date_tested) {
        this.date_tested = date_tested;
    }

    public static class dateObject implements Serializable{
        String date;
        Integer timezone_type;
        String timezone;

        dateObject(String date, Integer timezone_type, String timezone) {
            this.date = date;
            this.timezone_type = timezone_type;
            this.timezone = timezone;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getTimezone_type() {
            return timezone_type;
        }

        public void setTimezone_type(Integer timezone_type) {
            this.timezone_type = timezone_type;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        
    }
}
