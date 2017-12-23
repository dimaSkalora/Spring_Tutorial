package spring_framework.wideskills_com.lesson_10.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticMethod {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_10/staticMethod-beans.xml");
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
    }
}
