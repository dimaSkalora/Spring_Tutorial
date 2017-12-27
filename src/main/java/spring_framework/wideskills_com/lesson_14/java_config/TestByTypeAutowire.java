package spring_framework.wideskills_com.lesson_14.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_14.java_config.beans.ByTypeBeans;
import spring_framework.wideskills_com.lesson_14.java_config.byType.Room;


public class TestByTypeAutowire {
    public static void main(String[] args) {
        ApplicationContext context =
              new AnnotationConfigApplicationContext(ByTypeBeans.class);
        Room room = context.getBean(Room.class);
        System.out.println(room);
    }
}
