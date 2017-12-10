package spring_framework.tutorialspoint_com.lesson_07.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_07/definition-beans.xml");
        HelloWorld world = (HelloWorld)applicationContext.getBean("helloWorld");
        world.getMessage();
    }
}
