package com.client.ws.wsapi.exceptions;

public class NotFoundExceptionHandler extends RuntimeException{

    public NotFoundExceptionHandler(String message){
        super(message);
    }
}
