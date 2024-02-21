package com.example.courceproj2.service;

import com.example.courceproj2.domain.Question;

import java.util.*;

public class JavaQuestionService implements QuestionService {
    public Set<Question> questionsSet;

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        questionsSet.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questionsSet.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questionsSet.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questionsSet;
    }

    @Override
    public Question getRandomQuestion() {
        int setSize = questionsSet.size();
        int randomIndex = (int) (Math.random() * setSize);
        return questionsSet.stream()
                .skip(randomIndex)
                .findFirst()
                .orElseThrow();

    }

//    public Question getRandomQuestion() {
//        Random random = new Random();
//        int index = random.nextInt(questionsSet.size());
//        return questionsSet.get(index);
//    }
}


