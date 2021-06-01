package com.java.concepts.enums;

public enum HttpStatus {

    CREATES("Created", 201),
    NOT_FOUND("Not Found", 404);

    private final String statusMessage;
    private final int statusCode;

    HttpStatus(String statusMessage, int statusCode) {
        this.statusMessage = statusMessage;
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
