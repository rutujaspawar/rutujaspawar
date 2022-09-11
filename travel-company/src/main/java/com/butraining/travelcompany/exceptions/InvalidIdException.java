package com.butraining.travelcompany.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidIdException extends RuntimeException {
    
    private static final long serialVersionUID = 42L;
    public InvalidIdException(String s)
    {
        super(s);
    }
    



}