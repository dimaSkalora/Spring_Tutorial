package spring_framework.wideskills_com.lesson_15.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_15.java_config.beans.RequiredBeans;
import spring_framework.wideskills_com.lesson_15.java_config.required.Student;

public class TestRequiredAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
              new AnnotationConfigApplicationContext(RequiredBeans.class);
        Student student = (Student)context.getBean("studentBean");
        System.out.println(student.getName());
    }
}
