package spring_framework.proselyte_net.lesson_07.bean_post_processor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageWithPostBeanProcessorRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/proselyte_net/Lesson_07/post-processor-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println("\n==================================");
        System.out.println(message.getMessage());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
