package com.fintech.riskmanagementservic.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorResponse {
	
	private static final Logger logger = LoggerFactory.getLogger(ErrorResponse.class); 
	
	private String error;
    private String message;
    private int statusCode;
    
    public ErrorResponse(String error, String message, int statusCode) {
        this.error = error;
        this.message = message;
        this.statusCode = statusCode;
        logger.info("ErrorResponse created: Error={}, Message={}, StatusCode={}", error, message, statusCode);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
