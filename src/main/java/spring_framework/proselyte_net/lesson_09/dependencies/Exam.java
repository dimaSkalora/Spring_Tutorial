package spring_framework.proselyte_net.lesson_09.dependencies;

public class Exam {
    private AnswerChecker answerChecker;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
