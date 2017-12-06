package spring_framework.proselyte_net.lesson_12.annotations.jsr_250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_12/annotations-jsr250-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
