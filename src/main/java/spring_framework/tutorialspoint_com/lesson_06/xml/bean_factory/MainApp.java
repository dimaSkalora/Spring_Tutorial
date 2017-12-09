package spring_framework.tutorialspoint_com.lesson_06.xml.bean_factory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("SpringFramework/tutorialspoint_com/Lesson_06/beanFactory-beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
    }
}
