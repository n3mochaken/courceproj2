package com.example.courceproj2.controller;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.service.ExaminerService;
import com.example.courceproj2.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/exam")

public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("quest{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount) {

        return examinerService.getQuestions(amount);
    }

}






