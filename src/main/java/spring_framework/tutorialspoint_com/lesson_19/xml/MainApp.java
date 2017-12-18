package spring_framework.tutorialspoint_com.lesson_19.xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_19/customEvents-beans.xml");

        CustomEventPublisher cvp =
                (CustomEventPublisher) context.getBean("customEventPublisher");

        cvp.publish();
        cvp.publish();
    }
}
