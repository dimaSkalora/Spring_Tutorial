package spring_framework.wideskills_com.lesson_14.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_14.java_config.beans.ByNameBeans;
import spring_framework.wideskills_com.lesson_14.java_config.byName.Room;

public class TestByNameAutowire {
    public static void main(String[] args) {
        ApplicationContext context =
             new AnnotationConfigApplicationContext(ByNameBeans.class);
        Room room = (Room)context.getBean("room");
        System.out.println(room);
    }
}
