package spring_framework.proselyte_net.lesson_03.spring_ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MessageRunnerWithBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("SpringFramework/proselyte_net/Lesson_03/message-bean.xml"));
        Message message = (Message) factory.getBean("fromBeanMessage");
        System.out.println(message.getMessage());

        /*ApplicationContext context =
                new FileSystemXmlApplicationContext("disk:/Spring/Spring_Tutorial/src/main/resources/SpringFramework/proselyte_net/Lesson_03/message-bean.xml");
        Message messageContext = (Message) context.getBean("fromBeanMessage");
        System.out.println(message.getMessage());*/


    }
}
