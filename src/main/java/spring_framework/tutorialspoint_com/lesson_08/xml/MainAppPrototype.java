package spring_framework.tutorialspoint_com.lesson_08.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppPrototype {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_08/prototype-beans.xml");
        HelloWorld worldA = (HelloWorld)applicationContext.getBean("helloWorld");
        worldA.setMessage("I'm object A");
        worldA.getMessage();

        HelloWorld worldB = (HelloWorld)applicationContext.getBean("helloWorld");
        worldB.getMessage();
    }
}
