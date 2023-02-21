package com.urtv.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MovieException.class)
    public ResponseEntity<MyErrorDetails> runtimeException(MovieException e, WebRequest w){
        MyErrorDetails err=new MyErrorDetails();
        err.setDateTime(LocalDateTime.now());
        err.setDetails(w.getDescription(false));
        err.setMessage(e.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> checkedException(Exception e, WebRequest w){
        MyErrorDetails err=new MyErrorDetails();
        err.setDateTime(LocalDateTime.now());
        err.setDetails(w.getDescription(false));
        err.setMessage(e.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> noHandlerFoundException(NoHandlerFoundException e, WebRequest w){
        MyErrorDetails err=new MyErrorDetails();
        err.setDateTime(LocalDateTime.now());
        err.setDetails(w.getDescription(false));
        err.setMessage(e.getMessage());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MyErrorDetails> methodArgumentNotValidException(MethodArgumentNotValidException e){
        MyErrorDetails err=new MyErrorDetails();
        err.setDateTime(LocalDateTime.now());
        err.setDetails(e.getBindingResult().getFieldError().getDefaultMessage());
        err.setMessage("Validation Error");
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
