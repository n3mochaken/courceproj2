package com.example.courceproj2.controller;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.service.ExaminerService;
import com.example.courceproj2.service.QuestionService;

import java.util.List;

public class ExamController {
    private final ExaminerService examinerService;
    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    public List<Question> getQuestion (int amount){

        return (List<Question>) examinerService.getQuestions(amount);
    }

}
