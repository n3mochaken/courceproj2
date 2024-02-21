package com.example.courceproj2.service;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.exception.NotEnoughQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;
    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public List<Question> getQuestions(int amount) {
        List<Question> questions = new ArrayList<>();
        while(questions.size()< amount){
            Question question = questionService.getRandomQuestion();
            if(questions.contains(question)){
                questions.add(question);
            }
        }
        if (questions.size()<amount){
            throw new NotEnoughQuestions("Вопросов не хватает");
        }
        return questions;
    }
}
