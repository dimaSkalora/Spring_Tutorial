package spring_framework.tutorialspoint_com.lesson_20.xml.xml_schema_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_20/xmlSchemaBased-beans.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
