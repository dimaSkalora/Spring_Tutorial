package spring_framework.wideskills_com.lesson_10.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSchool {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_10/school-beans.xml");
        School school =(School)context.getBean("school");
        System.out.println(school.getName());
        System.out.println(school.getStudent().getName());
    }
}
