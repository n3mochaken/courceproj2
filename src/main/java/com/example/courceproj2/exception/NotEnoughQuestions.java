package com.example.courceproj2.exception;

public class NotEnoughQuestions extends RuntimeException{
    public NotEnoughQuestions(String message){
        super(message);
    }
}
