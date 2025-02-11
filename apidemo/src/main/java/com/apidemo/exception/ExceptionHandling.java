package com.apidemo.exception;

import com.apidemo.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> handleResouceNotFound(
            ResourceNotFound ex,
            WebRequest request
    ){
        ErrorDetails error = new ErrorDetails(
                ex.getMessage(),
                new Date(),
                request.getDescription(true)
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //If any other exception occuring
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleAllExceptions(
           Exception ex,
           WebRequest request
    ){
        ErrorDetails error = new ErrorDetails(
                ex.getMessage(),
                new Date(),
                request.getDescription(true)
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
