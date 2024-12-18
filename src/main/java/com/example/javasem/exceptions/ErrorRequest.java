package com.example.javasem.exceptions;

public class ErrorRequest extends RuntimeException {
    public ErrorRequest(String message) {
        super(message);
    }
}
