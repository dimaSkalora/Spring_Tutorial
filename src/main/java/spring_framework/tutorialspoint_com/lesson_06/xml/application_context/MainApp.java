package spring_framework.tutorialspoint_com.lesson_06.xml.application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new FileSystemXmlApplicationContext
                        ("C:/Users/ZARA/workspace/HelloSpring/src/applicationContext-beans.xml");
        HelloWorld world = (HelloWorld)applicationContext.getBean("helloWorld");
        world.getMessage();
    }
}
