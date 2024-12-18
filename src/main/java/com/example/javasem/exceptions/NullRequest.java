package com.example.javasem.exceptions;

public class NullRequest extends RuntimeException {
    public NullRequest(String message) {
        super(message);
    }
}
