package spring_framework.wideskills_com.lesson_05.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCalculation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        DisplayMessage displayMessage = context.getBean(DisplayMessage.class);
        String message = displayMessage.getMessage();
        System.out.println(message);
    }
}
