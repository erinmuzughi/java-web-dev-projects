package org.example;

import java.util.ArrayList;

public abstract class Question {
   private String questionText;
   private ArrayList<String> answerChoices;

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public Question(String questionText, ArrayList<String> answerChoices) {
        this.questionText = questionText;
        this.answerChoices = answerChoices;
    }

    public abstract void displayQuestion();

    public abstract void displayAnswerSet();

    public abstract void getUserAnswer();
}
