package spring_framework.proselyte_net.lesson_11.autowiring.by_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_11/autowiring-by-type-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
