package com.example.courceproj2.exception;

public class InvalidQestionException extends IllegalArgumentException {
    public InvalidQestionException(int amount, int size) {
        super(String.format("Requested amount %d more then current size %d",amount,size));
    }
}
