package spring_framework.proselyte_net.lesson_05.spring_ioc.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_05/prototype/message-bean.xml");

        Message message = (Message) context.getBean("printMessage");
        message.setMessage("This is first object.");
        System.out.println(message.getMessage());

        Message oneMoreMessage = (Message) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());
    }
}
