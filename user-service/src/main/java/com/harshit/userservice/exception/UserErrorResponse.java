package com.harshit.userservice.exception;

public class UserErrorResponse {
    private String errorMessage;
    private int statusCode;
    private long exceptionTime;

    public UserErrorResponse() {
    }

    public UserErrorResponse(String errorMessage, int statusCode, long exceptionTime) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.exceptionTime = exceptionTime;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public long getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(long exceptionTime) {
        this.exceptionTime = exceptionTime;
    }
}
