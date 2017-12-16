package spring_framework.tutorialspoint_com.lesson_16.xml.jsr_250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_16/jsr_250-beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
