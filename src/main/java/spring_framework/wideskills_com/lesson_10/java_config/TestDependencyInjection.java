package spring_framework.wideskills_com.lesson_10.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_10.java_config.beans.DiBeans;

public class TestDependencyInjection {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(DiBeans.class);
        Room room = context.getBean(Room.class);
        System.out.println(room);

        RoomSet roomSet = context.getBean(RoomSet.class);
        System.out.println(roomSet);

    }
}
