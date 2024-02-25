package com.example.courceproj2.implementations;

import com.example.courceproj2.domain.Question;
import com.example.courceproj2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service

public class JavaQuestionService implements QuestionService {
    private final Set<Question> questionsSet = new HashSet<>();
    private Random random = new Random();
    public void serRandom(Random random){
        this.random = random;}

    @Override
    public boolean add(String question, String answer) {
        return questionsSet.add(new Question(question,answer));
    }



    @Override
    public boolean remove(String question, String answer) {
        return questionsSet.remove(new Question(question,answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionsSet);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionsSet).get(random.nextInt(questionsSet.size()));

    }

    @Override
    public int getSize() {
        return questionsSet.size();
    }

}


