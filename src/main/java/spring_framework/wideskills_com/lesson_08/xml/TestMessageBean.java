package spring_framework.wideskills_com.lesson_08.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageBean {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_08/messageBean-beans.xml");
        MessageBean bean = (MessageBean)context.getBean("messageBean");
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}
