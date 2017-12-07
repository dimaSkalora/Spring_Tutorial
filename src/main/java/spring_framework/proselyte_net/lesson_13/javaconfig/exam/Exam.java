package spring_framework.proselyte_net.lesson_13.javaconfig.exam;

public class Exam {
    private AnswerChecker answerChecker;

    public Exam(AnswerChecker answerChecker) {
        System.out.println("Exam constructor.");
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
