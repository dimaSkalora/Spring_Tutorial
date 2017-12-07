package spring_framework.proselyte_net.lesson_13.javaconfig.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MessageConfig.class);

        Message message = context.getBean(Message.class);

        message.setMessage("This is simple message.");
        System.out.println(message);
    }
}
