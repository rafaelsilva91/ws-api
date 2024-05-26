package com.client.ws.wsapi.exceptions.handler;

import com.client.ws.wsapi.exceptions.NotFoundExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(NotFoundExceptionHandler.class)
    public ResponseEntity<String> notFoundExceptionHandler(NotFoundExceptionHandler n) {
        String errorMessage = n.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }

}
