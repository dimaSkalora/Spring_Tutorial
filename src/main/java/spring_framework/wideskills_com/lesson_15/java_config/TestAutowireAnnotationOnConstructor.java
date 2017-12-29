package spring_framework.wideskills_com.lesson_15.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_15.java_config.autowired.constructor.Room;
import spring_framework.wideskills_com.lesson_15.java_config.beans.AutowiredConstructorBeans;

public class TestAutowireAnnotationOnConstructor {
          public static void main(String[] args) {
            ApplicationContext context =
                 new AnnotationConfigApplicationContext(AutowiredConstructorBeans.class);
            Room room = (Room)context.getBean("room");
            System.out.println(room);
        }
}
