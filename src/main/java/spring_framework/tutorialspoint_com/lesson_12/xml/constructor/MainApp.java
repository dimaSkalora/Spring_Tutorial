package spring_framework.tutorialspoint_com.lesson_12.xml.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.tutorialspoint_com.lesson_05.xml.HelloWorld;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_12/constructorDI-beans.xml");
        TextEditor te = (TextEditor) applicationContext.getBean("textEditor");
        te.spellCheck();
    }
}
