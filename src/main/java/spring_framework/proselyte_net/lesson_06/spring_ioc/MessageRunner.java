package spring_framework.proselyte_net.lesson_06.spring_ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_06/message-bean.xml");


        Message message = (Message) context.getBean("printMessage");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
