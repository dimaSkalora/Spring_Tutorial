package spring_framework.wideskills_com.lesson_10.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_10.java_config.beans.SchoolBeans;

public class TestSchool {
    public static void main(String[] args) {
        ApplicationContext context =
             new AnnotationConfigApplicationContext(SchoolBeans.class);
        School school =(School)context.getBean("school");
        System.out.println(school.getName());
        System.out.println(school.getStudent().getName());
    }
}
