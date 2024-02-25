package com.example.courceproj2.service;

import com.example.courceproj2.domain.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

