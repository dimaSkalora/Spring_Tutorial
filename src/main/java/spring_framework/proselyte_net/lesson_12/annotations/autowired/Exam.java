package spring_framework.proselyte_net.lesson_12.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {
    private AnswerChecker answerChecker;

    /**
     * Constructor
     */
    @Autowired
    public Exam(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
    }

    /**
     * Getters and Setters
     */
    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
