package org.example;

import java.util.ArrayList;

import java.util.Scanner;

public class MultipleChoice extends Question {
    private String questionText;
    private ArrayList<String> answerChoices;
    private String correctAnswer;


    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public MultipleChoice(String questionText, ArrayList<String> answerChoices, String correctAnswer) {
        super(questionText, answerChoices);
        this.correctAnswer = correctAnswer;
    }


    public void displayAnswerSet() {
        for (String answer : answerChoices){
            System.out.println(answer);
        }
    }
    Scanner scanner = new Scanner(System.in);

//    public void getUserAnswer() {
//        System.out.print("Enter your choice (A/B/C/D): ");
//        String userChoice = scanner.nextLine().toUpperCase();
//
//        // Check the user's answer
//        if (correctAnswer[0].equals(userChoice)) {
//            System.out.println("Correct! The answer is:" + correctAnswer + "!");
//        }
//
//        scanner.close();
//    }

}
