package spring_framework.wideskills_com.lesson_04.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestGreetingMessage {
    public static void main(String[] args) {
        BeanFactory beanFactory =
                new XmlBeanFactory( new ClassPathResource("SpringFramework/wideskills_com/Lesson_04/spring-beans.xml"));

        GreetingMessage objBeanFactory = (GreetingMessage) beanFactory.getBean("greetingMessage");

        String messageBaen = objBeanFactory.getMessage();
        System.out.println(messageBaen);


        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_04/spring-beans.xml");

        GreetingMessage objContext = (GreetingMessage) context.getBean("greetingMessage");

        String messageContext = objContext.getMessage();
        System.out.println(messageContext);
    }
}
