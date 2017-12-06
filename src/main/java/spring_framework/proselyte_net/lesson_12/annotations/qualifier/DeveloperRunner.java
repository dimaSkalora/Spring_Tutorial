package spring_framework.proselyte_net.lesson_12.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_12/annotations-qualifier-config.xml");

        Position position = (Position) context.getBean("position");

        position.getDevelopersInfo();
    }
}
