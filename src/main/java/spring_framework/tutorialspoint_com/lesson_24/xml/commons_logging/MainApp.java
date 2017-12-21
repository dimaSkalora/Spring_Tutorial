package spring_framework.tutorialspoint_com.lesson_24.xml.commons_logging;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging. Log;
import org.apache.commons.logging. LogFactory;

public class MainApp {
    static Log log = LogFactory.getLog(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_24/commonsLogging-beans.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        log.info("Exiting the program");
    }
}
