package com.example.courceproj2.service;

import com.example.courceproj2.domain.Question;

import java.util.Collection;

public interface QuestionService {
    boolean add(String question, String answer);
    boolean remove (String question, String answer);
    Collection<Question>getAll();

    Question getRandomQuestion();
    int getSize();
}