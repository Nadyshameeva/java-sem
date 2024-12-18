package com.example.javasem.exceptions;

public class ErrorReadingProperties extends RuntimeException {
    public ErrorReadingProperties(String message) {
        super(message);
    }
}
