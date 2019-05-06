package com.springboot.springbootapp.exception;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationError {

    private int code;
    private String message;
    @Value("${api_doc_url}")
    private String details;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
