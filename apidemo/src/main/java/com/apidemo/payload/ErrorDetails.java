package com.apidemo.payload;

import lombok.Data;

import java.util.Date;

public class ErrorDetails {
    private String message;
    private Date date;
    private String description;

    public ErrorDetails(String message, Date date, String description) {
        this.date = date;
        this.description = description;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getMessage() {
        return message;
    }
}
