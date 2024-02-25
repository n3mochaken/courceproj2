
package com.example.courceproj2.implementations;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.exception.InvalidQestionException;
import com.example.courceproj2.exception.NotEnoughQuestions;
import com.example.courceproj2.service.ExaminerService;
import com.example.courceproj2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Collection<Question> getQuestions(int amount) {
       int size = questionService.getSize();
        if (amount <= 0 || size < amount) {
            throw new InvalidQestionException(amount, size);
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}


