package spring_framework.proselyte_net.lesson_14.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_14/message-event-handling-config.xml");
        context.start();
        Message message = (Message) context.getBean("message");
        System.out.println(message);
        context.stop();
    }
}
