package com.springboot.springbootapp.exception;

public class MedicineNotFoundException extends RuntimeException {

    public MedicineNotFoundException(String message){
        super(message);
    }

}
