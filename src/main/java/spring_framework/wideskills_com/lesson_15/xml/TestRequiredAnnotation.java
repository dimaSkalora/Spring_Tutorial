package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.required.Student;

public class TestRequiredAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/required -beans.xml");
        Student student = (Student)context.getBean("studentBean");
        System.out.println(student.getName());
    }
}
