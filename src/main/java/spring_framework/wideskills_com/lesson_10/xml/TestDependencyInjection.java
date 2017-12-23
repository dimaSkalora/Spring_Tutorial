package spring_framework.wideskills_com.lesson_10.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestDependencyInjection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_10/di-beans.xml");
        Room room = (Room)context.getBean("room");
        System.out.println(room);
        RoomSet roomSet = (RoomSet)context.getBean("roomSet");
        System.out.println(roomSet);
    }
}
