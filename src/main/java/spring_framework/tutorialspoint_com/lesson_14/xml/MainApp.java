package spring_framework.tutorialspoint_com.lesson_14.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.tutorialspoint_com.lesson_05.xml.HelloWorld;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_14/injectingCollection-beans.xml");
        JavaCollection jc=(JavaCollection)applicationContext.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
