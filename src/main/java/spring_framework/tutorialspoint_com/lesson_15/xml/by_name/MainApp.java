package spring_framework.tutorialspoint_com.lesson_15.xml.by_name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringFramework/tutorialspoint_com/Lesson_15/autowiringByName-benas.xml");
        TextEditor te = (TextEditor) applicationContext.getBean("textEditor");
        te.spellCheck();
    }
}
