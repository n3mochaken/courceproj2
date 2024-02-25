package com.example.courceproj2.controller;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public void addQuestion(@RequestParam("q") String question,
                                @RequestParam("a") String answer) {
         questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public void removeQuestion(@RequestParam("q") String question,
                                   @RequestParam("a") String answer) {
         questionService.remove(question, answer);
    }

    @GetMapping
    public Collection<Question> showAll() {
        return questionService.getAll();
    }

}


