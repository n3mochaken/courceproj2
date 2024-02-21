package com.example.courceproj2.domain;

import java.util.Objects;

public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {

        this.question = question;
        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return Objects.equals(getQuestion(), question.getQuestion())
                && Objects.equals(getAnswer(), question.getAnswer());
    }
    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return "Question - { "+ question+'\''+"}"+
                "Answer - { "+ answer+'\''+"}";
    }
}



