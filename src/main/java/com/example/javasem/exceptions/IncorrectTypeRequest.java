package com.example.javasem.exceptions;

public class IncorrectTypeRequest extends RuntimeException {
    public IncorrectTypeRequest(String message) {
        super(message);
    }
}
