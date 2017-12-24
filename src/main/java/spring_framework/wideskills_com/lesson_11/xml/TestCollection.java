package spring_framework.wideskills_com.lesson_11.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCollection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_11/listSet-beans.xml");
        Country country = (Country)context.getBean("country");
        System.out.println(country.getStatesName());
        System.out.println(country.getStatesList());
        System.out.println(country.getStatesSet());
    }
}
