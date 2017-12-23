package spring_framework.wideskills_com.lesson_10.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_10.java_config.beans.StaticMethodBeans;

public class TestStaticMethod {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(StaticMethodBeans.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
    }
}
