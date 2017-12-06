package spring_framework.proselyte_net.lesson_11.autowiring.by_name;

import spring_framework.proselyte_net.lesson_11.autowiring.by_name.AnswerChecker;

public class Exam {
    private AnswerChecker answerChecker;
    private String subject;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
