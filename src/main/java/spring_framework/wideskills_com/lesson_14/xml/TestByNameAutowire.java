package spring_framework.wideskills_com.lesson_14.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_framework.wideskills_com.lesson_14.xml.byName.Room;

public class TestByNameAutowire {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_14/byName-beans.xml");
        Room room = (Room)context.getBean("room");
        System.out.println(room);
    }
}
