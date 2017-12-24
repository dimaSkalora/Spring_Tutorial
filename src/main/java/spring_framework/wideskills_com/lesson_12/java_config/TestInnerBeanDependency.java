package spring_framework.wideskills_com.lesson_12.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_12.java_config.beans.StudentBeans;

public class TestInnerBeanDependency {
    public static void main(String[] args) {
        ApplicationContext context =
          new AnnotationConfigApplicationContext(StudentBeans.class);
        Room room = (Room)context.getBean("room");
        System.out.println(room);
    }
}
