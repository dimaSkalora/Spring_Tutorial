package spring_framework.proselyte_net.lesson_12.annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_12/annotations-autowired-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
