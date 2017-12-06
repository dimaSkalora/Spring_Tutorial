package spring_framework.proselyte_net.lesson_12.annotations.autowired;

public class AnswerChecker {
    public AnswerChecker() {
        System.out.println("AnswerChecker constructor initiated.");
    }

    public void checkAnswer() {
        //Here should be some business logic...
        System.out.println("Now we are checking answer.");
    }
}
