package spring_framework.tutorialspoint_com.lesson_12.xml.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_12/setTerDI-beans.xml");
        TextEditor te = (TextEditor) applicationContext.getBean("textEditor");
        te.spellCheck();
    }
}
