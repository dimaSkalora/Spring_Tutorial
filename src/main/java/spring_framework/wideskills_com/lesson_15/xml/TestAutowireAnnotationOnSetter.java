package spring_framework.wideskills_com.lesson_15.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_15.xml.autowired.setter_methods.Room;

public class TestAutowireAnnotationOnSetter{
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_15/autowiredSetter-beans.xml");
        Room room = (Room)context.getBean("room");
        System.out.println(room);
    }
}
